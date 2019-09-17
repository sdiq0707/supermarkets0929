package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.SupplierMapper;
import com.woniu.domain.Supplier;
import com.woniu.service.ISupplierService;
@Service
public class SupplierServiceImple implements ISupplierService {
	@Autowired
	private SupplierMapper supplierMapper;
	public void save(Supplier supplier) {
		supplierMapper.insert(supplier);
	}

	public void delete(Integer supplierid) {
		supplierMapper.deleteByPrimaryKey(supplierid);
	}

	public void update(Supplier supplier) {
		supplierMapper.updateByPrimaryKeySelective(supplier);
	}

	public Supplier findOne(Integer supplierid) {
		return supplierMapper.selectByPrimaryKey(supplierid);
	}

	public List<Supplier> findAll() {
		return supplierMapper.selectByExample(null);
	}

}
