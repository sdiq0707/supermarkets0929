package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.TreeMapper;
import com.woniu.domain.Tree;
import com.woniu.service.ITreeService;

@Service
@Transactional
public class TreeServiceImpl implements ITreeService {
	
	@Autowired
	private TreeMapper mapper;
	
	@Override
	public void save(Tree tree) {
		// TODO Auto-generated method stub
		mapper.insertSelective(tree);
	}

	@Override
	public void delete(Integer treeid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(treeid);
	}

	@Override
	public void update(Tree tree) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(tree);
	}

	@Override
	public Tree find(Integer treeid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(treeid);
	}

	@Override
	public List<Tree> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

}
