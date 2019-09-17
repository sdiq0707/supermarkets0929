package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tlog implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer logid;

    private String logtype;

    private String logname;

    private Integer userid;

    private String classname;

    private String method;

    private Date createtime;

    private String message;

    private Integer roleid;

}