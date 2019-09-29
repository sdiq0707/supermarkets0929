package com.woniu.service;

import java.util.List;

import com.woniu.domain.Vip;

public interface IVipService {
	void save(Vip vip);
	void delete(Integer vipid);
	void update(Vip vip);
	Vip find(Integer vipid);
	List<Vip> findAll();
	
}
