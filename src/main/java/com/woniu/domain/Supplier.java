package com.woniu.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer supplierid;

    private String sname;

    private String slinkman;

    private String sphone;

    private String saddress;

    private String sbank;

    private String saccountid;

    private String sothers;

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSlinkman() {
        return slinkman;
    }

    public void setSlinkman(String slinkman) {
        this.slinkman = slinkman;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public String getSbank() {
        return sbank;
    }

    public void setSbank(String sbank) {
        this.sbank = sbank;
    }

    public String getSaccountid() {
        return saccountid;
    }

    public void setSaccountid(String saccountid) {
        this.saccountid = saccountid;
    }

    public String getSothers() {
        return sothers;
    }

    public void setSothers(String sothers) {
        this.sothers = sothers;
    }

	@Override
	public String toString() {
		return "Supplier [supplierid=" + supplierid + ", sname=" + sname + ", slinkman=" + slinkman + ", sphone="
				+ sphone + ", saddress=" + saddress + ", sbank=" + sbank + ", saccountid=" + saccountid + ", sothers="
				+ sothers + "]";
	}
    
}