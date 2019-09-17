package com.woniu.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Productspecification implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer psid;

    private String psname;

}