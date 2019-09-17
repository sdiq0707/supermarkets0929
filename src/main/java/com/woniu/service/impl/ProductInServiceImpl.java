package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.ProductinMapper;
import com.woniu.domain.Productin;
import com.woniu.service.IProductInService;
@Service
public class ProductInServiceImpl implements IProductInService {
	@Autowired
	private ProductinMapper productinMapper;
	public void save(Productin productin) {
		productinMapper.insert(productin);
	}

	public void delete(Integer piid) {
		productinMapper.deleteByPrimaryKey(piid);
	}

	public void update(Productin productin) {
		productinMapper.updateByPrimaryKey(productin);
	}

	public Productin findOne(Integer piid) {
		return productinMapper.selectByPrimaryKey(piid);
	}

	public List<Productin> findAll() {
		return productinMapper.selectByExample(null);
	}

}
