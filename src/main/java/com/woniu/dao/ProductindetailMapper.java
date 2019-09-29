package com.woniu.dao;

import com.woniu.domain.Productindetail;
import com.woniu.domain.ProductindetailExample;
import com.woniu.domain.Triple;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductindetailMapper {
    int countByExample(ProductindetailExample example);

    int deleteByExample(ProductindetailExample example);

    int deleteByPrimaryKey(Integer piid);

    int insert(Productindetail record);

    int insertSelective(Productindetail record);

    List<Productindetail> selectByExample(ProductindetailExample example);

    Productindetail selectByPrimaryKey(Integer piid);

    int updateByExampleSelective(@Param("record") Productindetail record, @Param("example") ProductindetailExample example);

    int updateByExample(@Param("record") Productindetail record, @Param("example") ProductindetailExample example);

    int updateByPrimaryKeySelective(Productindetail record);

    int updateByPrimaryKey(Productindetail record);
    
    
    //统计供货商的供货次数和金额
    List<Triple<String,Long, Double>> findAllByNull();
    //统计某个供货商的详细供货信息
    List<Triple<String,BigDecimal, Double>> findAllBySname(String sname);
    //统计所有商品的进货件数与总金额
    List<Triple<String,BigDecimal, Double>> findAllByProduct();
    
    
}