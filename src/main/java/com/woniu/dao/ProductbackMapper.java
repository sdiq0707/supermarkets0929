package com.woniu.dao;

import com.woniu.domain.Productback;
import com.woniu.domain.ProductbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductbackMapper {
    int countByExample(ProductbackExample example);

    int deleteByExample(ProductbackExample example);

    int deleteByPrimaryKey(Integer pbid);

    int insert(Productback record);

    int insertSelective(Productback record);

    List<Productback> selectByExample(ProductbackExample example);

    Productback selectByPrimaryKey(Integer pbid);

    int updateByExampleSelective(@Param("record") Productback record, @Param("example") ProductbackExample example);

    int updateByExample(@Param("record") Productback record, @Param("example") ProductbackExample example);

    int updateByPrimaryKeySelective(Productback record);

    int updateByPrimaryKey(Productback record);
}