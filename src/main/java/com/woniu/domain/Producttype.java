package com.woniu.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producttype implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer ptypeid;

    private String ptypename;

}