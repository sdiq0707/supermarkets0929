package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.RoleMapper;
import com.woniu.dao.StaffMapper;
import com.woniu.domain.Role;
import com.woniu.domain.Vip;
import com.woniu.service.IRoleService;

@Service
@Transactional
public class RoleServiceImpl implements IRoleService {

	@Autowired
	private RoleMapper mapper;
	@Override
	public void save(Role role) {
		// TODO Auto-generated method stub
		mapper.insertSelective(role);
	}

	@Override
	public void delete(Integer roleid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(roleid);
	}

	@Override
	public void update(Role role) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(role);
	}

	@Override
	public Role find(Integer roleid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(roleid);
	}

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

}
