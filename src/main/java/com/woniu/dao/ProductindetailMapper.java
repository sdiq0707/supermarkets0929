package com.woniu.dao;

import com.woniu.domain.Productindetail;
import com.woniu.domain.ProductindetailExample;
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
}