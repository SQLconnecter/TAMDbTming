package com.guapi.starter.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.Query;

import com.guapi.starter.mybatis.entity.City;
import com.guapi.starter.mybatis.entity.CityExample;

@Mapper
public interface CityMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(City record);

	int insertSelective(City record);

	List<City> selectByExample(CityExample example);

	City selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(City record);

	int updateByPrimaryKey(City record);

	@Select("select * from city")
	List<City> selectAll();
}