package com.woniu.service;

import java.util.List;

import com.woniu.domain.Productin;

public interface IProductInService {   
	public void save(Productin productin);
	public void delete(Integer piid);
	public void update(Productin productin);
	public Productin findOne(Integer piid);
	public List<Productin> findAll();
}
