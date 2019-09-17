package com.woniu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.woniu.domain.Tlog;

@Service
public interface ITlogService {

	void save(Tlog tlog);
	void delete(Integer logid);
	void update(Tlog tlog);
	List<Tlog> findAll();
	Tlog findOne(Integer logid);
	
}
