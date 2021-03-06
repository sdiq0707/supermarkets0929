package com.woniu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.Productin;
import com.woniu.service.IProductInService;

@RestController
@RequestMapping("/productIns")
public class ProductInController {
	@Autowired
	private IProductInService productInservice;
	//添加  
	@PostMapping
	public void save(@RequestBody Productin productin) {
		productInservice.save(productin);
	}
	//删除
	@DeleteMapping
	public void delete( int piid) {
		productInservice.delete(piid);
	}
	//修改  
	@PutMapping
	public void update(Productin productin) {
		productInservice.update(productin);
	}
	//查询一个    
	@GetMapping("/findOne/{piid}")
	public void findOne(@PathVariable("piid") int piid) {
		 productInservice.findOne(piid);
	}
	//查询所有
	@GetMapping
	public List<Productin> findAll() { 
		
		return productInservice.findAll();
	}
}
