package com.woniu.service;

import java.util.List;

import com.woniu.domain.Productindetail;

public interface IProductINDetailService {
	void save(Productindetail pd);
	void delete(Integer piid);
	void update(Productindetail pd);
	Productindetail find(Integer piid);
	List<Productindetail> findAll();   
}
