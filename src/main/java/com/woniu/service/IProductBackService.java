package com.woniu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.ProductbackMapper;
import com.woniu.domain.Productback;

public interface IProductBackService {
	void save(Productback productback);
	void delete(Integer pbid);
	void update(Productback productback);
	List<Productback> findAll();
	Productback  findOne(Integer pbid);
}
