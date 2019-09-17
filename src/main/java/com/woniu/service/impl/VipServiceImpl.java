package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.StaffMapper;
import com.woniu.dao.VipMapper;
import com.woniu.domain.Vip;
import com.woniu.service.IVipService;

@Service
@Transactional
public class VipServiceImpl implements IVipService {

	@Autowired
	private VipMapper mapper;
	
	@Override
	public void save(Vip vip) {
		// TODO Auto-generated method stub
		mapper.insertSelective(vip);
	}

	@Override
	public void delete(Integer vipid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(vipid);
	}

	@Override
	public void update(Vip vip) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(vip);
	}

	@Override
	public Vip find(Integer vipid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(vipid);
		
	}

	@Override
	public List<Vip> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

}
