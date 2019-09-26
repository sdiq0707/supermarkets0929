package com.woniu.service;

import java.util.List;

import com.woniu.domain.Role;

public interface IRoleService {
	void save(Role role);
	void delete(Integer roleid);
	void update(Role role);
	Role find(Integer roleid);
	List<Role> findAll();
}
