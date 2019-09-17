package com.woniu.service;

import java.util.List;

import com.woniu.domain.Supplier;
 
public interface ISupplierService {
	public void save(Supplier supplier);
	public void delete(Integer supplierid);
	public void update(Supplier supplier);
	public Supplier findOne(Integer supplierid);
	public List<Supplier> findAll();
}
