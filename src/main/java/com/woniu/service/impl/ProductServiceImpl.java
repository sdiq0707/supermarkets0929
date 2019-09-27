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

	@Override
	public void upAndDown(Integer productid) {
		Product product=select(productid);
		String others=product.getPstate();
		if(others!=null) {
		if(others.equals("在售")) {
			product.setPstate("已下架");
		}else {
			product.setPstate("在售");
		}
		update(product);
	}

}

	@Override
	public List<Product> select(String name) {
		// TODO Auto-generated method stub
		return mapper.findProductByKeyStr(name);
	}}
