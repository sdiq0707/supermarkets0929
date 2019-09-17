package com.woniu.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Productindetail implements  Serializable{
   
	private static final long serialVersionUID = 1L;

	private Integer piid;

    private Integer productid;

    private String pname;

    private Integer piinquantiy;

    private Float pimportprice;

    private Integer supplierid;

    public Integer getPiid() {
        return piid;
    }

    public void setPiid(Integer piid) {
        this.piid = piid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPiinquantiy() {
        return piinquantiy;
    }

    public void setPiinquantiy(Integer piinquantiy) {
        this.piinquantiy = piinquantiy;
    }

    public Float getPimportprice() {
        return pimportprice;
    }

    public void setPimportprice(Float pimportprice) {
        this.pimportprice = pimportprice;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

	@Override
	public String toString() {
		return "Productindetail [piid=" + piid + ", pname=" + pname + ", piinquantiy=" + piinquantiy + ", pimportprice="
				+ pimportprice + "]";
	}
    
}