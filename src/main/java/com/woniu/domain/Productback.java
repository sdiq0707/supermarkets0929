package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Productback implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer pbid;

    private Float pballprice;

    private Date pbdate;

    private Integer userid;

    private Integer bdid;

    private String pbothers;

}