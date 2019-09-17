package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vip implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer vipid;

    private String vipname;

    private Integer vipscore;

    private String vippark;

    private String vipphone;

    private Date vipdate;

    private Boolean status;

}