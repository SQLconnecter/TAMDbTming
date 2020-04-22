package com.guapi.starter.mongo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.guapi.starter.utils.MongoDBClient;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
@RunWith(SpringRunner.class)
public class MongoTest {
	@Autowired
	private MongoDBClient mongoDBClient;

	@Test
	public void test1() {
		String[] strsStrings = { "_id" };
		List<String> filed = mongoDBClient.getFiled("SXhtmls", strsStrings);

	}

}
