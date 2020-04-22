package com.guapi.starter.utils;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

/**
 * @author Neo 调用发送http请求
 *
 */
public class JsoupUtils {
	private static final String CONTENT_TYPE = "Content-Type";
	private static final String HEADER_TYPE = "application/json";

	public static Connection getConn(String URL) {

		Connection connect = Jsoup.connect(URL);
		connect.ignoreHttpErrors(true);
		connect.method(Connection.Method.GET);
		connect.ignoreContentType(true);
		connect.header(CONTENT_TYPE, HEADER_TYPE);

		return connect;
	}
}
