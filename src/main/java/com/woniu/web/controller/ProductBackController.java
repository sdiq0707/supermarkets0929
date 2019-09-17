package com.woniu.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.Productback;
import com.woniu.service.IProductBackService;

@RestController
@RequestMapping("productBack")
public class ProductBackController {
	@Autowired IProductBackService service;
	@PostMapping("/save")
	public void save(Productback productback) {
		service.save(productback);
	}
	@DeleteMapping("/delete")
	public void delete(Integer pbid) {
		service.delete(pbid);
	}
	@PutMapping("/update")
	public void update(Productback productback) {
		service.update(productback);
	}
	@GetMapping("/findOne")
	public void findOne(Integer pbid ) {
		service.findOne(pbid);
	}
	@ResponseBody
	@GetMapping("/findAll")
	public void findAll() {
		service.findAll();
	}
}
