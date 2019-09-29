package com.woniu.service;

import java.util.List;

import com.woniu.domain.Productin;
import com.woniu.domain.Tlog;
 
public  interface IProductInService {   
	public void save(Productin productin);
	public void delete(Integer piid);
	public void update(Productin productin);
	public Productin findOne(Integer piid);
	//public List<Productin> findAll();
	List<Productin> findAll(Integer currPage,Integer pageSize);
	Integer count();
}
