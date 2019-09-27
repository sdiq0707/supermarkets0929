package com.woniu.service.impl;
 
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.ProductinMapper;
import com.woniu.domain.Productin;
import com.woniu.domain.Tlog;
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

	/*
	 * public List<Productin> findAll() { return
	 * productinMapper.selectByExample(null); }
	 */
	@Override
	public List<Productin> findAll(Integer currPage,Integer pageSize) {

		Map<String, Integer> data = new HashMap<>();
        data.put("currIndex", (currPage-1)*pageSize);
        data.put("pageSize", pageSize);
        
		return productinMapper.findAllBySql(data);
	}
	
	@Override
	public Integer count() {
		Integer countByExample = productinMapper.countByExample(null);
		return countByExample;
	}
}
