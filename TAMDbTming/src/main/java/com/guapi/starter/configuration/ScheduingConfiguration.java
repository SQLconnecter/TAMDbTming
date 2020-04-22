package com.guapi.starter.configuration;

import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;

import com.guapi.starter.scheduler.MainSchedulerThread;

@Configuration
@EnableScheduling
public class ScheduingConfiguration implements SchedulingConfigurer {

	private static final Logger log = LoggerFactory.getLogger(ScheduingConfiguration.class);

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		// TODO Auto-generated method stub

		log.info("开始注册定时任务");
		/*
		CronTrigger cronTrigger = new CronTrigger(cityCornString);
		CronTrigger cronTrigger2 = new CronTrigger(provinceCornString);
		CronTrigger cronTrigger3 = new CronTrigger(shanXiangCornString);
		taskRegistrar.addTriggerTask(new CityTaskRunnable(), cronTrigger);
		taskRegistrar.addTriggerTask(new ProvinceTaskRunnable(), cronTrigger2);
		taskRegistrar.addTriggerTask(new ShangXiangRunnable(), cronTrigger3);
		taskRegistrar.setScheduler(Executors.newScheduledThreadPool(3));
		*/
		// taskRegistrar.setScheduler(taskExecutor());//开启多线程的支持
		CronTrigger cronTrigger = new CronTrigger("0 0/2 * * * ? ");
		taskRegistrar.addTriggerTask(new MainSchedulerThread(),cronTrigger);
		taskRegistrar.setScheduler(Executors.newScheduledThreadPool(3));
	}
}
