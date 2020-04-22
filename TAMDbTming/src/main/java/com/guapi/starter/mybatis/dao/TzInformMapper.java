package com.guapi.starter.mybatis.dao;

import com.guapi.starter.mybatis.entity.TzInform;
import com.guapi.starter.mybatis.entity.TzInformExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface TzInformMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TzInform record);

    int insertSelective(TzInform record);

    List<TzInform> selectByExample(TzInformExample example);

    TzInform selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TzInform record);

    int updateByPrimaryKey(TzInform record);
}