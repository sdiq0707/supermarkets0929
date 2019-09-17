package com.woniu.dao;

import com.woniu.domain.Productspecification;
import com.woniu.domain.ProductspecificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductspecificationMapper {
    int countByExample(ProductspecificationExample example);

    int deleteByExample(ProductspecificationExample example);

    int deleteByPrimaryKey(Integer psid);

    int insert(Productspecification record);

    int insertSelective(Productspecification record);

    List<Productspecification> selectByExample(ProductspecificationExample example);

    Productspecification selectByPrimaryKey(Integer psid);

    int updateByExampleSelective(@Param("record") Productspecification record, @Param("example") ProductspecificationExample example);

    int updateByExample(@Param("record") Productspecification record, @Param("example") ProductspecificationExample example);

    int updateByPrimaryKeySelective(Productspecification record);

    int updateByPrimaryKey(Productspecification record);
}