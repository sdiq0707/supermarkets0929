package com.woniu.service;

import java.util.List;

import com.woniu.domain.Staff;

public interface IStaffService {
	void save(Staff staff);
	void delete(Integer staffid);
	void update(Staff staff);
	Staff find(Integer staffid);
	List<Staff> findAll();
}
