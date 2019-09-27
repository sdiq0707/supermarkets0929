package com.woniu.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.Tlog;
import com.woniu.service.ITlogService;

/* 
 *  controller层的日志使用Log打印信息, service层的日志使用数据库记录操作日志
 *	通过添加一个AOP切面，监控controller层的所有方法：
 *	调用之前打印请求信息，包含URL,HTTP_METHOD,IP,CLASS_METHOD,ARGS；
 *	在方法完成后，打印返回的请求结果，包含code, msg。
*/

@RestController		//@ResponseBody的作用：将目标方法的返回值自动转换成json格式，然后返回给前端
@RequestMapping("/logs")
public class TlogController {
	
	@Autowired
	private ITlogService service;
	
	@PostMapping("save")
	public String save(@RequestBody Tlog tlog) {
		service.save(tlog);
		return "保存成功！";
	}
	@DeleteMapping("delete")
	public String delete(Integer logid) {
		service.delete(logid);
		return "删除成功";
	}
	@PostMapping("delAll")
	public String delAll(List<Integer> params) {
		System.out.println("TlogController.delAll()"+120+params);
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
	@PostMapping("findAll")
	public Map<String, Object> findAll(Integer currPage,Integer pageSize) {
		Map<String,Object> map = new HashMap<>();
		
		List<Tlog> list = service.findAll(currPage,pageSize);
		Integer count = service.count();
		
		map.put("list", list);
		map.put("count", count);
		
		return map;
	}

}