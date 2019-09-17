package com.woniu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@PutMapping("/save")
	public String save(Productin productin) {
		productInservice.save(productin);
		return "true";
	}
	//删除
	@DeleteMapping("/delete/{piid}")
	public String delete(@PathVariable("piid") int piid) {
		productInservice.delete(piid);
		return "true";
	}
	//修改
	@PostMapping("/update")
	public String update(Productin productin) {
		productInservice.update(productin);
		return "true";
	}
	//查询一个
	@GetMapping("/findOne/{piid}")
	public Productin findOne(@PathVariable("piid") int piid) {
		return productInservice.findOne(piid);
	}
	//查询所有
	@GetMapping("/findAll")
	public List<Productin> findAll() {
		return productInservice.findAll();
	}
}
