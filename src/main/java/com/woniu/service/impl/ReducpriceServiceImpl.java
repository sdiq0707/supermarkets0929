package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.ReducepriceMapper;
import com.woniu.domain.Reduceprice;
import com.woniu.service.IReducepriceService;
@Service
@Transactional
public class ReducpriceServiceImpl implements IReducepriceService {
	@Autowired
	private ReducepriceMapper mapper;
	@Override
	public void save(Reduceprice reduceprice) {
		mapper.insertSelective(reduceprice);
	}

	@Override
	public void delete(Integer rid) {
   mapper.deleteByPrimaryKey(rid);
	}

	@Override
	public void update(Reduceprice reduceprice) {
     mapper.updateByPrimaryKeySelective(reduceprice);

	}

	@Override
	public Reduceprice select(Integer rid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(rid);
	}

	@Override
	public List<Reduceprice> select() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

}
