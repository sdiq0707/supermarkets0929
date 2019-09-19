package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sales implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer saleid;

    private Float saleallprice;

    private Date saledate;

    private String saleothers;
    
    private Integer userid;
    
    private Integer vipid;
    
    private Integer sdid;
    
    //操作员实体
    private Userinfo userinfo;
    
    //销售详情实体
    private Salesdetail salesdetail;
    
    //会员信息实体
    private Vip vip;

}