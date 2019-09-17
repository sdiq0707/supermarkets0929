package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reduceprice implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer rid;

    private Integer productid;

    private Float rchangeprice;

    private Float rchangevipprice;

    private Date rsdate;

    private Date redate;

    private String rothers;

}