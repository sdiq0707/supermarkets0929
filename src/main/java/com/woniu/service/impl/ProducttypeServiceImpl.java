package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.ProducttypeMapper;
import com.woniu.domain.Producttype;
import com.woniu.service.IProducttypeService;
@Service
@Transactional
public class ProducttypeServiceImpl implements IProducttypeService {
	@Autowired
	private ProducttypeMapper mapper;
	@Override
	public void save(Producttype producttype) {
          mapper.insertSelective(producttype);
	}

	@Override
	public void delete(Integer ptypeid) {
       mapper.deleteByPrimaryKey(ptypeid);
	}

	@Override
	public void update(Producttype producttype) {
        mapper.updateByPrimaryKeySelective(producttype);
	}

	@Override
	public Producttype select(Integer ptypeid) {
		return mapper.selectByPrimaryKey(ptypeid);
	}

	@Override
	public List<Producttype> select() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

}
