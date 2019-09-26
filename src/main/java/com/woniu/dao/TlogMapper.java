package com.woniu.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.woniu.domain.Tlog;
import com.woniu.domain.TlogExample;

public interface TlogMapper {
	
	List<Tlog> findAllBySql(Map<String, Integer> data);
	
	//-----------------------
	
    int countByExample(TlogExample example);

    int deleteByExample(TlogExample example);

    int deleteByPrimaryKey(Integer logid);

    int insert(Tlog record);

    int insertSelective(Tlog record);

    List<Tlog> selectByExample(TlogExample example);

    Tlog selectByPrimaryKey(Integer logid);

    int updateByExampleSelective(@Param("record") Tlog record, @Param("example") TlogExample example);

    int updateByExample(@Param("record") Tlog record, @Param("example") TlogExample example);

    int updateByPrimaryKeySelective(Tlog record);

    int updateByPrimaryKey(Tlog record);
}