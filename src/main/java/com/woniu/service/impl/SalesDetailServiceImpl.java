package com.woniu.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.SalesdetailMapper;
import com.woniu.domain.Salesdetail;
import com.woniu.domain.Triple;
import com.woniu.service.ISalesDetailService;
@Service
public class SalesDetailServiceImpl implements ISalesDetailService {
	@Autowired
	private SalesdetailMapper mapper;
	@Override
	public void save(Salesdetail salesdetail) {
		mapper.insertSelective(salesdetail);
	}

	@Override
	public void delete(Integer sdid) {
		mapper.deleteByPrimaryKey(sdid);
	}

	@Override
	public void update(Salesdetail salesdetail) {
		mapper.updateByPrimaryKeySelective(salesdetail);
	}

	@Override
	public List<Salesdetail> findAll() {
		List<Salesdetail> list = mapper.findAllSaleDetail();
		return list;
	}

	@Override
	public Salesdetail findOne(Integer sdid) {
		Salesdetail salesdetail=mapper.selectByPrimaryKey(sdid);
		return salesdetail;
	}

	@Override
	public List<Triple<String, BigDecimal, Double>> findAllBySales() {
		return mapper.findAllBySales();
	}

}
