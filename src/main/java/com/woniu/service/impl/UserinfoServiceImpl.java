package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.UserinfoMapper;
import com.woniu.domain.Userinfo;
import com.woniu.service.IUserinfoService;

@Service
@Transactional
public class UserinfoServiceImpl implements IUserinfoService {

	@Resource
	private UserinfoMapper userinfoMapper;

	@Override
	public void save(Userinfo userinfo) {
		userinfoMapper.insert(userinfo);
	}

	@Override
	public void delete(Integer userid) {
		userinfoMapper.deleteByPrimaryKey(userid);
	}

	@Override
	public void update(Userinfo userinfo) {
		userinfoMapper.updateByPrimaryKeySelective(userinfo);
	}

	@Override
	public List<Userinfo> findAll() {
		return userinfoMapper.selectByExample(null);
	}

	@Override
	public Userinfo findOne(Integer userid) {
		return userinfoMapper.selectByPrimaryKey(userid);
	}
	
}
