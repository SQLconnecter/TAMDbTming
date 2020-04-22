package com.guapi.starter.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Neo 工具类
 */
public class BeanUtils {

	/**
	 * @return 提供一个基于时间上的业务主键
	 */
	public static String getID() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String format = sdf.format(date);
		double random = Math.random();
		int num =(int) (random*900+100);
		return format+num;
	}
	public static void main(String[] args) {
		String id = BeanUtils.getID();
		System.out.println(id);
	}
}
