package com.woniu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.woniu.domain.Userinfo;

@Service
public interface IUserinfoService {

	void save(Userinfo userinfo);
	void delete(Integer userid);
	void update(Userinfo userinfo);
	List<Userinfo> findAll();
	Userinfo findOne(Integer userid); 
	
}
