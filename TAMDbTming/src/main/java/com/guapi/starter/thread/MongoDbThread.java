package com.guapi.starter.thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.AsyncResult;

import com.guapi.starter.mybatis.dao.OrderContentMapper;
import com.guapi.starter.mybatis.entity.OrderContent;
import com.guapi.starter.utils.ApplicationContextUtils;
import com.guapi.starter.utils.MongoDBClient;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MongoDbThread implements Callable<Future<List<String>>> {
	private static final String COLLECTION = "SXhtmls";
	private OrderContentMapper orderContentMapper;
	private MongoDBClient mongocClient;

	public MongoDbThread() {
		orderContentMapper = ApplicationContextUtils.getBean(OrderContentMapper.class);
		mongocClient = ApplicationContextUtils.getBean(MongoDBClient.class);
	}

	@Override
	public Future<List<String>> call() throws Exception {
		// TODO Auto-generated method stub
		log.info("-----------------获取mongo中的订阅的数据--------starter------");
		long starter = System.currentTimeMillis();
		List<String> mongoDbID = getMongoDbID();
		long endedr = System.currentTimeMillis();
		log.info("本次从mongo上获取信息花费时间："+(endedr-starter));
		return new AsyncResult<>(mongoDbID);
	}

	// 获取所有需要更新的城市
	private HashMap<String, HashSet<String>> getCitys() {
		HashMap<String, HashSet<String>> citysHashMap = new HashMap<String, HashSet<String>>();
		ArrayList<String> provinceList = new ArrayList<>();
		List<OrderContent> selectAll = orderContentMapper.selectAll();

		for (int i = 0; i < selectAll.size(); i++) {
			String province = selectAll.get(i).getProvince();
			if (!provinceList.contains(province)) {
				// 没有包含就放到集合里面
				String city = selectAll.get(i).getCity();
				provinceList.add(province);
				citysHashMap.put(province, new HashSet<String>());
				citysHashMap.get(province).add(city);
			} else {
				String city = selectAll.get(i).getCity();
				citysHashMap.get(province).add(city);
			}
		}
		return citysHashMap;
	}

	private List<String> getMongoDbID() {
		String[] fields = { "_id" };
		List<String> filed = mongocClient.getFiled(COLLECTION, fields);
		log.info("从mongo中获取的主键有："+filed.size());
		return filed;
	}
}
