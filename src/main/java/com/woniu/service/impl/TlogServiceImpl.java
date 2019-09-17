package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.TlogMapper;
import com.woniu.domain.Tlog;
import com.woniu.service.ITlogService;

@Service
@Transactional
public class TlogServiceImpl implements ITlogService {

	@Autowired
	private TlogMapper tlogMapper;

	@Override
	public void save(Tlog tlog) {
		tlogMapper.insert(tlog);
	}

	@Override
	public void delete(Integer logid) {
		tlogMapper.deleteByPrimaryKey(logid);
	}

	@Override
	public void update(Tlog tlog) {
		tlogMapper.updateByPrimaryKeySelective(tlog);
	}

	@Override
	public List<Tlog> findAll() {
		return tlogMapper.selectByExample(null);
	}

	@Override
	public Tlog findOne(Integer logid) {
		return tlogMapper.selectByPrimaryKey(logid);
	}

}
