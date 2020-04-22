package com.guapi.starter.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.guapi.starter.mybatis.entity.DataSource;
import com.guapi.starter.mybatis.entity.DataSourceExample;

@Mapper
public interface DataSourceMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(DataSource record);

	int insertSelective(DataSource record);

	List<DataSource> selectByExample(DataSourceExample example);

	DataSource selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(DataSource record);

	int updateByPrimaryKey(DataSource record);

	@Select("select * from data_source where name ='山香教育'")
	List<DataSource> selectAll();
}