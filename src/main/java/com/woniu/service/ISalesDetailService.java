package com.woniu.service;

import java.math.BigDecimal;
import java.util.List;

import com.woniu.domain.Salesdetail;
import com.woniu.domain.Triple;

public interface ISalesDetailService {
	void save(Salesdetail salesdetail);
	void delete(Integer sdid);
	void update(Salesdetail salesdetail);
	List<Salesdetail> findAll();
	Salesdetail findOne(Integer sdid);
	List<Triple<String, BigDecimal, Double>> findAllBySales();
}
