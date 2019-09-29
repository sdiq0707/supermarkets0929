package com.woniu.service;

import java.math.BigDecimal;
import java.util.List;

import com.woniu.domain.Productindetail;
import com.woniu.domain.Triple;
  
public interface IProductINDetailService {
	void save(Productindetail pd);
	void delete(Integer piid);
	void update(Productindetail pd);
	Productindetail find(Integer piid);
	List<Productindetail> findAll();   
	
	List<Triple<String,Long, Double>> findAllByNull();
    
    List<Triple<String,BigDecimal, Double>> findAllBySname(String sname);
    
    List<Triple<String,BigDecimal, Double>> findAllByProduct();
}
