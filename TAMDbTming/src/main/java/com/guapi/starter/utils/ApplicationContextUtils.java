package com.guapi.starter.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextUtils implements ApplicationContextAware {
	private static ApplicationContext applicationContextu;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		applicationContextu = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContextu;
	}

	public static <T> T getBean(Class<T> clazz) {
		return getApplicationContext().getBean(clazz);
	}

	public static Object getBean(String className) {
		return getApplicationContext().getBean(className);
	}
	
	public static <T> T getBean(String beanName,Class <T> clazz) {
		return getApplicationContext().getBean(beanName, clazz);
	}
}
