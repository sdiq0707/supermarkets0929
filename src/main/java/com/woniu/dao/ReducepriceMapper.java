package com.woniu.dao;

import com.woniu.domain.Reduceprice;
import com.woniu.domain.ReducepriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReducepriceMapper {
    int countByExample(ReducepriceExample example);

    int deleteByExample(ReducepriceExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Reduceprice record);

    int insertSelective(Reduceprice record);

    List<Reduceprice> selectByExample(ReducepriceExample example);

    Reduceprice selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Reduceprice record, @Param("example") ReducepriceExample example);

    int updateByExample(@Param("record") Reduceprice record, @Param("example") ReducepriceExample example);

    int updateByPrimaryKeySelective(Reduceprice record);

    int updateByPrimaryKey(Reduceprice record);
}