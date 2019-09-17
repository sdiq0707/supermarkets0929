package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.ProductindetailMapper;
import com.woniu.domain.Productindetail;
import com.woniu.service.IProductINDetailService;

@Service
@Transactional
public class ProductINDetailServiceImpl implements IProductINDetailService {

	 
	@Resource
	private ProductindetailMapper productindetailMapper;
	
	@Override
	public void save(Productindetail pd) {
		productindetailMapper.insertSelective(pd);
	}

	@Override
	public void delete(Integer piid) {
		productindetailMapper.deleteByPrimaryKey(piid);
	}

	@Override
	public void update(Productindetail pd) {
		productindetailMapper.updateByPrimaryKeySelective(pd);
	}

	@Override
	public Productindetail find(Integer piid) {
		return productindetailMapper.selectByPrimaryKey(piid);
	}

	@Override
	public List<Productindetail> findAll() {
		return productindetailMapper.selectByExample(null);
	}

}
