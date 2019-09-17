package com.woniu.dao;

import com.woniu.domain.Tlog;
import com.woniu.domain.TlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TlogMapper {
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