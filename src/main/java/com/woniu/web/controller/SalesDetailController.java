package com.woniu.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.Salesdetail;
import com.woniu.service.ISalesDetailService;

@RestController
@RequestMapping("salesDetail")
public class SalesDetailController {
	@Autowired ISalesDetailService service;
	@PostMapping("/save")
	public void save(Salesdetail salesdetail) {
		
	}
	@DeleteMapping("/delete")
	public void delete(Integer sdid) {
		service.delete(sdid);
	}
	@PutMapping("/update")
	public void update(Salesdetail salesdetail) {
		service.update(salesdetail);
	}
	@GetMapping("/findOne")
	public void findOne(Integer sdid ) {
		service.findOne(sdid);
	}
	@GetMapping("/findAll")
	public void findAll() {
		service.findAll();
	}
}
