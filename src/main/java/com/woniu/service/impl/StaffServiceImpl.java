package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.StaffMapper;
import com.woniu.domain.Staff;
import com.woniu.domain.StaffExample;
import com.woniu.service.IStaffService;

@Service
@Transactional
public class StaffServiceImpl implements IStaffService {
	
	@Autowired
	private StaffMapper mapper;
	@Override
	public void save(Staff staff) {
		// TODO Auto-generated method stub
		mapper.insertSelective(staff);
	}

	@Override
	public void delete(Integer staffid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(staffid);
	}

	@Override
	public void update(Staff staff) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(staff);
	}

	@Override
	public Staff find(Integer staffid) {
		Staff staff=mapper.selectByPrimaryKey(staffid);
		return staff;
	}

	@Override
	public List<Staff> findAll() {
		// TODO Auto-generated method stub
		List<Staff>staff=mapper.selectByExample(null);
		return staff;
		
	}
	
	
}
