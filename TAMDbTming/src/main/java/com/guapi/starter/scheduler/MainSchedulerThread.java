package com.guapi.starter.scheduler;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Future;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.guapi.starter.mongo.pojo.SXHtml;
import com.guapi.starter.mybatis.dao.TzInformMapper;
import com.guapi.starter.mybatis.dao.UpdLogMapper;
import com.guapi.starter.mybatis.entity.TzInform;
import com.guapi.starter.mybatis.entity.UpdLog;
import com.guapi.starter.thread.MongoDbThread;
import com.guapi.starter.thread.SoapThread;
import com.guapi.starter.utils.ApplicationContextUtils;
import com.guapi.starter.utils.MongoDBClient;

import javassist.expr.NewArray;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Neo 定时任务的主方法
 */
@Slf4j
public class MainSchedulerThread implements Runnable {
	private static final String COLLECTION = "SXhtmls";
	private MongoDBClient mongoDBClient;
	private ArrayList<SXHtml> sxhtmls = new ArrayList<>();
	private UpdLogMapper updLogMapper;
	private TzInformMapper tzInformMapper;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyymmddhhmmssSSS");

	public MainSchedulerThread() {
		// TODO Auto-generated constructor stub
		this.mongoDBClient = ApplicationContextUtils.getBean(MongoDBClient.class);
		this.updLogMapper = ApplicationContextUtils.getBean(UpdLogMapper.class);
		this.tzInformMapper = ApplicationContextUtils.getBean(TzInformMapper.class);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 线程1启动
		// 线程2启动
		log.info("定时任务主线程启动====================》");
		Date starter = new Date(System.currentTimeMillis());
		boolean flag = true;
		// 这里需要初始化sxhtmls，因为下次线程启动不知道会不会释放上次的资源；经过测试不会
		try {
			Future<List<SXHtml>> htmls = new SoapThread().call();
			Future<List<String>> mongos = new MongoDbThread().call();
			List<SXHtml> list = htmls.get();
			List<String> list2 = mongos.get();
			ArrayList<String> ids = new ArrayList<>();
			list2.forEach(i -> {
				JSONObject parseObject = JSON.parseObject(i);
				String id = (String) parseObject.get("_id");
				ids.add(id);
			});
			for (SXHtml sXHtml : list) {
				if (ids.contains(sXHtml.getId())) {
					// 说明是历史上已经有的数据
					// 这条数据不需要处理
					continue;
				}
				sxhtmls.add(sXHtml);
			}
			if (sxhtmls.size() != 0) {
				mongoDBClient.add(sxhtmls, COLLECTION);
				// mongodb入库之后，同时生成对应的通知表
				// 生成统一的批次号
				String batch = sdf.format(new Date());
				for (SXHtml sxhtml : sxhtmls) {
					TzInform tzInform = new TzInform();
					tzInform.setArticleId(sxhtml.getId());
					tzInform.setBatch(batch);
					tzInform.setCity(sxhtml.getCityCode());
					tzInform.setProvince(sxhtml.getProvCode());
					tzInform.setRqMake(new Date());
					tzInform.setSend(0);
					tzInformMapper.insertSelective(tzInform);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error("定时任务主线程：mainScheduler出现了问题，请检查！");
			flag = false;
		}
		if (flag) {
			Date date = new Date(System.currentTimeMillis());
			UpdLog updLog = new UpdLog();
			updLog.setDataSource(1);
			updLog.setNum(sxhtmls.size());
			updLog.setRqStart(starter);
			updLog.setRqEnd(date);
			updLog.setMqFlag(0);
			int insert = updLogMapper.insertSelective(updLog);
			if (insert > 0) {
				log.info("====updlog记录表生成成功===============");
			}
			log.info("时间：" + date + "============>" + "完成获取新数据：" + sxhtmls.size());
		}
		log.info("定时任务主线程==========END==========》");
	}

}
