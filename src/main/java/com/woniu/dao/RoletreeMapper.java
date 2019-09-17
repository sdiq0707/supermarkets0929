package com.woniu.dao;

import com.woniu.domain.RoletreeExample;
import com.woniu.domain.RoletreeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoletreeMapper {
    int countByExample(RoletreeExample example);

    int deleteByExample(RoletreeExample example);

    int deleteByPrimaryKey(RoletreeKey key);

    int insert(RoletreeKey record);

    int insertSelective(RoletreeKey record);

    List<RoletreeKey> selectByExample(RoletreeExample example);

    int updateByExampleSelective(@Param("record") RoletreeKey record, @Param("example") RoletreeExample example);

    int updateByExample(@Param("record") RoletreeKey record, @Param("example") RoletreeExample example);
}