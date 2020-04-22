package com.guapi.starter.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.guapi.starter.mybatis.entity.OrderContent;
import com.guapi.starter.mybatis.entity.OrderContentExample;

@Mapper
public interface OrderContentMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(OrderContent record);

	int insertSelective(OrderContent record);

	List<OrderContent> selectByExample(OrderContentExample example);

	OrderContent selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(OrderContent record);

	int updateByPrimaryKey(OrderContent record);

	@Select("select * from order_content")
	List<OrderContent> selectAll();
}