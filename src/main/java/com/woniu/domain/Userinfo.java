package com.woniu.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Userinfo implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer userid;

    private String username;

    private String passwd;

    private String salt;

    private Integer staffid;

}