package com.guapi.starter.thread;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.guapi.starter.scheduler.MainSchedulerThread;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MainThreadTest {
	@Test
	public void test() {
		new MainSchedulerThread().run();
	}
}
