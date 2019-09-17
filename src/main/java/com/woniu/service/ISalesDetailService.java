package com.woniu.service;

import java.util.List;

import com.woniu.domain.Salesdetail;

public interface ISalesDetailService {
	void save(Salesdetail salesdetail);
	void delete(Integer sdid);
	void update(Salesdetail salesdetail);
	List<Salesdetail> findAll();
	Salesdetail findOne(Integer sdid);
}
