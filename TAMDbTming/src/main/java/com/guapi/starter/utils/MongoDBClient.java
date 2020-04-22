package com.guapi.starter.utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Projections;

import lombok.extern.slf4j.Slf4j;

 
/**
 * @ClassName MongoDBClient
 * @Desc TODO   MongoDB 工具类
 * @Date 2019/4/1 9:43
 * @Version 1.0
 */
@Component
@Slf4j
public class MongoDBClient {
 
    @Autowired
    private MongoTemplate mongoTemplate;
    
    /**
     * 在构造方法中添加超时的设置，避免长时间未返回导致数据存储异常
     */
    public MongoDBClient() {
    	
    }
 
    /*
     * @ClassName MongoDBClient
     * @Desc TODO   创建集合，并返回是否创建成功  -2：已存在 / -1：创建失败 / 1：创建成功
     * @Date 2019/4/1 10:59
     * @Version 1.0
     */
    public Integer createCollection(String collectionName){
        // 先判断集合是否存在
        if(mongoTemplate.collectionExists(collectionName)){
            return -2;
        }else{
            // 创建一个集合
            mongoTemplate.createCollection(collectionName);
            // 判断集合是否存在
            if(mongoTemplate.collectionExists(collectionName)){
                return 1;
            }else{
                return -1;
            }
        }
    }
 
    /*
     * @ClassName MongoDBClient
     * @Desc TODO   在指定集合中添加数据
     * @Date 2019/4/1 11:12
     * @Version 1.0
     */
    public void add(Collection<?> batchToSave , String collectionName){
        mongoTemplate.insert(batchToSave,collectionName);
    }
 
    /*
     * @ClassName MongoDBClient
     * @Desc TODO   根据条件和指定集合删除数据
     * @Date 2019/4/1 14:20
     * @Version 1.0
     */
    public void delete(Query query , Object obj , String collectionName){
        mongoTemplate.remove(query, obj.getClass(), collectionName);
    }
 
    /*
     * @ClassName MongoDBClient
     * @Desc TODO   根据条件更新数据
     * @Date 2019/4/1 14:30
     * @Version 1.0
     */
    public void update(Query query , Update update , Object obj , String collectionName){
        mongoTemplate.updateMulti(query , update , obj.getClass() , collectionName);
    }
 
    /*
     * @ClassName MongoDBClient
     * @Desc TODO   获取指定集合下的全部数据
     * @Date 2019/4/1 11:18
     * @Version 1.0
     */
    public List<?> getAllByCollectionName(Object obj , String collectionName){
        return mongoTemplate.findAll(obj.getClass(),collectionName);
    }
 
    /*
     * @ClassName MongoDBClient
     * @Desc TODO   根据条件和集合名称查询数据
     * @Date 2019/4/1 11:31
     * @Version 1.0
     */
    public List<?> getByConditionAndCollectionName(Query query , Object obj , String collectionName){
        return mongoTemplate.find(query, obj.getClass() , collectionName);
    }
    
    /**
     * @param collectionName 查询目标的集合
     * @param field 需要得到的自定义字段集合
     * @return {"id":""} 返回json字符串
     */
    public List<String> getFiled(String collectionName,String... field){
    	ArrayList<String> arrayList = new ArrayList<String>();
    	List<String> asList = Arrays.asList(field);
		MongoCollection<Document> collection = mongoTemplate.getDb().getCollection(collectionName);
		Document first = collection.find().first();
		for (String string : asList) {
			if(first==null) return arrayList;
			boolean containsKey = first.containsKey(string);
			if (!containsKey) {
				log.error("集合中不包含这个键："+string);
				return arrayList ;
			}
		}
		//需要首先检查里面是不是存在这些字段
		FindIterable<Document> projection = collection.find().projection(Projections.include(field));
		//假如没有这个结果可能返回的就是很多null,但是结果集并不是null对象，而是每个内容为null的对象
		for (Document document : projection) {
			arrayList.add(document.toJson());
		}
		return arrayList;
    }

 
}
