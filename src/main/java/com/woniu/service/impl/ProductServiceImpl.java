package com.woniu.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.ProductMapper;
import com.woniu.domain.Product;
import com.woniu.service.IProductService;
@Service
@Transactional
public class ProductServiceImpl implements IProductService {
	@Autowired
	private ProductMapper mapper;
	@Override
	public void save(Product product) {
         mapper.insertSelective(product);
	}

	@Override
	public void delete(Integer productid) {
       mapper.deleteByPrimaryKey(productid);
	}

	@Override
	public void update(Product product) {
    mapper.updateByPrimaryKeySelective(product);
	}

	@Override
	public Product select(Integer productid) {
		return mapper.selectByPrimaryKey(productid);
	}

	@Override
	public List<Product> select() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

}
