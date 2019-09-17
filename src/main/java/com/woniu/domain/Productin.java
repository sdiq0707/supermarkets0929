package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Productin implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer piid;

    private Date piindate;

    private Float piallprice;

    private String pipayway;

    private String pipay;

    private Integer userid;

    private String piothers;

    public Integer getPiid() {
        return piid;
    }

    public void setPiid(Integer piid) {
        this.piid = piid;
    }

    public Date getPiindate() {
        return piindate;
    }

    public void setPiindate(Date piindate) {
        this.piindate = piindate;
    }

    public Float getPiallprice() {
        return piallprice;
    }

    public void setPiallprice(Float piallprice) {
        this.piallprice = piallprice;
    }

    public String getPipayway() {
        return pipayway;
    }

    public void setPipayway(String pipayway) {
        this.pipayway = pipayway;
    }

    public String getPipay() {
        return pipay;
    }

    public void setPipay(String pipay) {
        this.pipay = pipay;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPiothers() {
        return piothers;
    }

    public void setPiothers(String piothers) {
        this.piothers = piothers;
    }

	@Override
	public String toString() {
		return "Productin [piid=" + piid + ", piindate=" + piindate + ", piallprice=" + piallprice + ", pipayway="
				+ pipayway + ", pipay=" + pipay + ", piothers=" + piothers + "]";
	}
    
}