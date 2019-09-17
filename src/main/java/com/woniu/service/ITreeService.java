package com.woniu.service;

import java.util.List;

import com.woniu.domain.Tree;

public interface ITreeService {
	void save(Tree tree);
	void delete(Integer treeid);
	void update(Tree tree);
	Tree find(Integer treeid);
	List<Tree> findAll();
}
