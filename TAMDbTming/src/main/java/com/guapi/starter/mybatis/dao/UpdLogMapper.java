package com.guapi.starter.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.guapi.starter.mybatis.entity.UpdLog;
import com.guapi.starter.mybatis.entity.UpdLogExample;

@Mapper
public interface UpdLogMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(UpdLog record);

	int insertSelective(UpdLog record);

	List<UpdLog> selectByExample(UpdLogExample example);

	UpdLog selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(UpdLog record);

	int updateByPrimaryKey(UpdLog record);

	/*
	 * @Insert(value = {
	 * "insert into upd_log (data_source, num, rq_start, rq_end, mq_flag) value" +
	 * "(#{dataSource, jdbcType=INTEGER}," + "#{num, jdbcType=INTEGER}," +
	 * "#{rqStart,jdbcType=TIMESTAMP}," + "#{rqEnd,jdbcType=TIMESTAMP}," +
	 * "#{flag, jdbcType=INTEGER})" }) boolean insertBySql(@Param("dataSource") int
	 * dataSource, @Param("num") int num, @Param("rqStart") Date rqStart,
	 * 
	 * @Param("rqEnd") Date rqEnd, @Param("flag") int flag);
	 */

}