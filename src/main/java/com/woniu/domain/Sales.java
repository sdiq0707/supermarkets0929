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

    private Integer userid;

    private Integer sdid;

    private Integer vipid;

    private String saleothers;

}