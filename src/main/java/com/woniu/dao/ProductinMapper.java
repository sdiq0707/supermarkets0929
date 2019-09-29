package com.woniu.dao;

import com.woniu.domain.Productin;
import com.woniu.domain.ProductinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductinMapper {
    int countByExample(ProductinExample example);

    int deleteByExample(ProductinExample example);

    int deleteByPrimaryKey(Integer piid);

    int insert(Productin record);

    int insertSelective(Productin record);

    List<Productin> selectByExample(ProductinExample example);

    Productin selectByPrimaryKey(Integer piid);

    int updateByExampleSelective(@Param("record") Productin record, @Param("example") ProductinExample example);

    int updateByExample(@Param("record") Productin record, @Param("example") ProductinExample example);

    int updateByPrimaryKeySelective(Productin record);

    int updateByPrimaryKey(Productin record);
}