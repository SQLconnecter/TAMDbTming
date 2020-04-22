package com.guapi.starter.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.Query;

import com.guapi.starter.mybatis.entity.Province;
import com.guapi.starter.mybatis.entity.ProvinceExample;

@Mapper
public interface ProvinceMapper {
	int deleteByPrimaryKey(String regncode);

	int insert(Province record);

	int insertSelective(Province record);

	List<Province> selectByExample(ProvinceExample example);

	Province selectByPrimaryKey(String regncode);

	int updateByPrimaryKeySelective(Province record);

	int updateByPrimaryKey(Province record);

	@Select("select * from province")
	List<Province> selectAll();
}