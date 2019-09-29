package com.woniu.dao;

import com.woniu.domain.Supplier;
import com.woniu.domain.SupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
 
public interface SupplierMapper {
    int countByExample(SupplierExample example);

    int deleteByExample(SupplierExample example);

    int deleteByPrimaryKey(Integer supplierid);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    List<Supplier> selectByExample(SupplierExample example);

    Supplier selectByPrimaryKey(Integer supplierid);

    int updateByExampleSelective(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByExample(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}