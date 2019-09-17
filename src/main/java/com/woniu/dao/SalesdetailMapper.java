package com.woniu.dao;

import com.woniu.domain.Salesdetail;
import com.woniu.domain.SalesdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesdetailMapper {
    int countByExample(SalesdetailExample example);

    int deleteByExample(SalesdetailExample example);

    int deleteByPrimaryKey(Integer sdid);

    int insert(Salesdetail record);

    int insertSelective(Salesdetail record);

    List<Salesdetail> selectByExample(SalesdetailExample example);

    Salesdetail selectByPrimaryKey(Integer sdid);

    int updateByExampleSelective(@Param("record") Salesdetail record, @Param("example") SalesdetailExample example);

    int updateByExample(@Param("record") Salesdetail record, @Param("example") SalesdetailExample example);

    int updateByPrimaryKeySelective(Salesdetail record);

    int updateByPrimaryKey(Salesdetail record);
}