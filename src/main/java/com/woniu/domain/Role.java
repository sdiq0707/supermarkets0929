package com.woniu.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer roleid;

    private String rolename;

    private String rothers;

}