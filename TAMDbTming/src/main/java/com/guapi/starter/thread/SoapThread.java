package com.guapi.starter.thread;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import org.jsoup.Connection;import org.springframework.data.convert.Jsr310Converters.StringToDurationConverter;
import org.springframework.scheduling.annotation.AsyncResult;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.guapi.starter.mongo.pojo.SXHtml;
import com.guapi.starter.mybatis.dao.CityMapper;
import com.guapi.starter.mybatis.dao.DataSourceMapper;
import com.guapi.starter.mybatis.dao.OrderContentMapper;
import com.guapi.starter.mybatis.dao.ProvinceMapper;
import com.guapi.starter.mybatis.entity.City;
import com.guapi.starter.mybatis.entity.DataSource;
import com.guapi.starter.mybatis.entity.OrderContent;
import com.guapi.starter.mybatis.entity.Province;
import com.guapi.starter.mybatis.entity.TimMess;
import com.guapi.starter.utils.ApplicationContextUtils;
import com.guapi.starter.utils.BeanUtils;
import com.guapi.starter.utils.JsoupUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SoapThread implements Callable<Future<List<SXHtml>>> {
	private static final String SECOND_TYPE = "100101";
	private static final String THIRD_TYPE = "10010101";
	private static final int SIZE = 10;
	private String URL;// 网页的URL，需要从数据库中获取
	private OrderContentMapper orderContentMapper;
	private DataSourceMapper dataSourceMapper;
	private CityMapper cityMapper;
	private ProvinceMapper provinceMapper;
	private HashMap<String, String> datasources;// 配置数据源
	private HashMap<String, String> mapperConverter;//配置转换器

	public SoapThread() {
		// TODO Auto-generated constructor stub
		this.orderContentMapper = ApplicationContextUtils.getBean(OrderContentMapper.class);
		this.dataSourceMapper = ApplicationContextUtils.getBean(DataSourceMapper.class);
		this.cityMapper = ApplicationContextUtils.getBean(CityMapper.class);
		this.provinceMapper = ApplicationContextUtils.getBean(ProvinceMapper.class);
		this.datasources = getDataSource();
		if (datasources != null && datasources.size() != 0) {
			this.URL = datasources.get("山香教育");
		} else {
			log.error("无法获取数据源，请检查数据库连接");
		}
		initMapper();//初始化转换器
	}

	@Override
	public Future<List<SXHtml>> call() throws Exception {
		// TODO Auto-generated method stub
		log.info("开始从网页上面获取数据：:::::::::start:::::::");
		long starter = System.currentTimeMillis();
		HashMap<String, String> url2 = getURL2();
		log.info(url2.toString());
		List<SXHtml> all = getAll(url2);
		long endedr = System.currentTimeMillis();
		log.info("本次从网页上获取信息花费时间："+(endedr-starter));
		return new AsyncResult<>(all);
	}

	/**
	 * 获取获取网页访问的地址
	 */
	/*
	private List<String> getURL() {
		ArrayList<String> urls = new ArrayList<String>();
		HashMap<String, HashSet<String>> citys = getCitys();
		log.info("订阅的城市有："+citys.toString());
		for (String province : citys.keySet()) {
			HashSet<String> citySet = citys.get(province);
			for (String citycode : citySet) {
				String tourl = URL + "?&provCode=" + province + "&secondType=" + SECOND_TYPE + "&thirdType="
						+ THIRD_TYPE + "&cityCode=" + citycode + "&page=" + 1 + "&limit=" + SIZE;
				urls.add(tourl);
			}
		}
		return urls;
	}
	*/
	
	/**
	 * 获取获取网页访问的地址2
	 */
	private HashMap<String, String> getURL2() {
		HashMap<String, String> urls = new HashMap<>();
		HashMap<String, HashSet<String>> citys = getCitys();
		log.info("订阅的城市有："+citys.toString());
		for (String province : citys.keySet()) {
			HashSet<String> citySet = citys.get(province);
			for (String citycode : citySet) {
				String tourl = URL + "?&provCode=" + province + "&secondType=" + SECOND_TYPE + "&thirdType="
						+ THIRD_TYPE + "&cityCode=" + citycode + "&page=" + 1 + "&limit=" + SIZE;
				urls.put(citycode, tourl);
			}
		}
		return urls;
	}

	private HashMap<String, String> getDataSource() {
		HashMap<String, String> hashMap = new HashMap<>();
		List<DataSource> dataSources = dataSourceMapper.selectAll();
		if (dataSources != null && dataSources.size() != 0) {
			hashMap.put(dataSources.get(0).getName(), dataSources.get(0).getUrl());
		}
		return hashMap;
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

	private List<SXHtml> getAll(HashMap<String, String> urls) {
		ArrayList<SXHtml> arrayList = new ArrayList<>();
		Set<Entry<String, String>> entrySet = urls.entrySet();
		for (Entry<String, String> entry : entrySet) {
			String cityCode = entry.getKey();
			String url = entry.getValue();
			log.info("发送请求："+url);
			Connection conn = JsoupUtils.getConn(url);
			String body = "";
			try {
				body = conn.execute().body();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				log.error("访问出现异常：" + url);
				continue;
			}
			List<SXHtml> htmls = getHtmls(body,cityCode);
			log.info("---------------------");
			for (SXHtml html : htmls) {
				log.info(html.getId());
			}
			boolean addAll = arrayList.addAll(htmls);
			if (!addAll) {
				log.error("数据出现问题，请排查");
			}
		}
		return arrayList;
	}

	/**
	 * @param body 报文的主体
	 * @return 处理完成之后的业务对象 先拿到记录对象
	 */
	private TimMess getBO(String body) {
		JSONObject parseObject = JSONObject.parseObject(body);
		TimMess javaObject = parseObject.toJavaObject(TimMess.class);
		String id = BeanUtils.getID();
		javaObject.setId(id);
		javaObject.setRqMake(new Date());
		javaObject.setSearchtime(new Date());
		return javaObject;
	}

	/**
	 * @param body 请求返回的报文
	 * @return 将报文的主体处理成业务对象
	 */
	private List<SXHtml> getHtmls(String body,String cityCode) {
		JSONObject parseObject = JSONObject.parseObject(body);
		JSONArray jsonArray = parseObject.getJSONArray("list");
		ArrayList<SXHtml> sXHtmls = new ArrayList<>();
		for (int i = 0; i < jsonArray.size(); i++) {
			SXHtml object = jsonArray.getObject(i, SXHtml.class);
			//转换编码
			object.setCityCode(cityCode);
			object.setProvCode(mapperConverter.get(object.getProvCode()));
			sXHtmls.add(object);
		}
		return sXHtmls;
	}
	//mongodb获取的数据里面省份和城市码有点问题，需要进行转换
	//比如将河南省置换成为对应的编码，将城市，置换成为对应的代码
	private void initMapper(){
		mapperConverter = new HashMap<>();
		List<City> selectAll = cityMapper.selectAll();
		selectAll.forEach(i->{
			mapperConverter.put(i.getName(),i.getId()+"");
		});
		List<Province> selectAll2 = provinceMapper.selectAll();
		selectAll2.forEach(i->{
			mapperConverter.put(i.getRegnnm(),i.getRegncode());
		});
	}

}
