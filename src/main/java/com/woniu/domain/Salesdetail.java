package com.woniu.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salesdetail implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer sdid;

    private Integer productid;

    private String pname;

    private Integer salequantiy;

    private Float psellprice;

    private Integer psid;

}