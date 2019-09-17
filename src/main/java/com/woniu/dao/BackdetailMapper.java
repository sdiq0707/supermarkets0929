package com.woniu.dao;

import com.woniu.domain.Backdetail;
import com.woniu.domain.BackdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackdetailMapper {
    int countByExample(BackdetailExample example);

    int deleteByExample(BackdetailExample example);

    int deleteByPrimaryKey(Integer bdid);

    int insert(Backdetail record);

    int insertSelective(Backdetail record);

    List<Backdetail> selectByExample(BackdetailExample example);

    Backdetail selectByPrimaryKey(Integer bdid);

    int updateByExampleSelective(@Param("record") Backdetail record, @Param("example") BackdetailExample example);

    int updateByExample(@Param("record") Backdetail record, @Param("example") BackdetailExample example);

    int updateByPrimaryKeySelective(Backdetail record);

    int updateByPrimaryKey(Backdetail record);
}