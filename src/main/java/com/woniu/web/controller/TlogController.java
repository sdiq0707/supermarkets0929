package com.woniu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.Tlog;
import com.woniu.service.ITlogService;

@RestController		//@ResponseBody的作用：将目标方法的返回值自动转换成json格式，然后返回给前端
@RequestMapping("/logs")
public class TlogController {
	
	@Autowired
	private ITlogService service;
	
	@PostMapping("save")
	public String save(Tlog tlog) {
		service.save(tlog);
		return null;
	}
	@DeleteMapping("delete")
	public String delete(Integer logid) {
		service.delete(logid);
		return "删除成功";
	}
	@PutMapping("update")
	public String update(Tlog tlog) {
		service.update(tlog);
		return "修改成功";
	}
	@GetMapping("findOne")
	public Tlog findOne(Integer logid) {
		return service.findOne(logid);
	}
	@GetMapping("findAll")
	public List<Tlog> findAll() {
		return service.findAll();
	}

}
