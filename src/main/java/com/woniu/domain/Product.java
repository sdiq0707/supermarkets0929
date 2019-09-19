package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer productid;

    private String pname;

    private Integer ptypeid;

    private Integer supplierid;

    private String pspecification;

    private String pcolor;

    private String pstate;

    private String punit;

    private Float pimportprice;

    private Float psellprice;

    private Integer pstocknum;

    private Integer pcautionnum;

    private Date pdeaddate;

    private Integer psid;

    private String pothers;
    
    //商品类型实体
    private Producttype producttype;

}