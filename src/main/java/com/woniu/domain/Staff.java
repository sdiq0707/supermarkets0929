package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer staffid;

    private String staffname;

    private Boolean staffsex;

    private Integer staffage;

    private String staffhome;

    private String staffdiploma;

    private Float staffsalary;

    private String staffduty;

    private String staffphone;

    private String staffaddress;

    private String staffidcard;

    private Date staffbegindate;

    private Date staffenacttime;

    private String staffothers;

}