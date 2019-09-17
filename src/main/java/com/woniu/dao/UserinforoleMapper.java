package com.woniu.dao;

import com.woniu.domain.UserinforoleExample;
import com.woniu.domain.UserinforoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinforoleMapper {
    int countByExample(UserinforoleExample example);

    int deleteByExample(UserinforoleExample example);

    int deleteByPrimaryKey(UserinforoleKey key);

    int insert(UserinforoleKey record);

    int insertSelective(UserinforoleKey record);

    List<UserinforoleKey> selectByExample(UserinforoleExample example);

    int updateByExampleSelective(@Param("record") UserinforoleKey record, @Param("example") UserinforoleExample example);

    int updateByExample(@Param("record") UserinforoleKey record, @Param("example") UserinforoleExample example);
}