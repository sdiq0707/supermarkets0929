package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.ProductbackMapper;
import com.woniu.domain.Productback;
import com.woniu.service.IProductBackService;
@Service
public class ProductBackServiceImpl implements IProductBackService {
	@Autowired
	private ProductbackMapper mapper;
	@Override
	public void save(Productback productback) {
		mapper.insertSelective(productback);
	}

	@Override
	public void delete(Integer pbid) {
		mapper.deleteByPrimaryKey(pbid);
	}

	@Override
	public void update(Productback productback) {
		mapper.updateByPrimaryKeySelective(productback);
	}

	@Override
	public List<Productback> findAll() {
		List<Productback> list = mapper.selectByExample(null);
		return list;
	}

	@Override
	public Productback findOne(Integer pbid) {
		Productback productback=mapper.selectByPrimaryKey(pbid);
		return productback;
	}

}
