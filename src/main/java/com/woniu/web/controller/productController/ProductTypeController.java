package com.woniu.web.controller.productController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.domain.Producttype;
import com.woniu.service.IProducttypeService;

@Controller
@RequestMapping("producttypes")
public class ProductTypeController {
	@Autowired
	   private IProducttypeService service;
	@PostMapping
	@ResponseBody()
	public void save(@RequestBody Producttype producttype) {
		service.save(producttype);
	}
	@DeleteMapping
	@ResponseBody
	public void delete(Integer ptypeid) {
		System.out.println(ptypeid);
		service.delete(ptypeid);
	}
	@PutMapping
	@ResponseBody
	public void update(Producttype producttype) {
		service.update(producttype);
	}
	@GetMapping
	@ResponseBody
	public List<Producttype> findAll(){
		return service.select();
	}
	@GetMapping(value="{ptypeid}")
	@ResponseBody
	public Producttype findOne(@PathVariable Integer ptypeid) {
		return service.select(ptypeid);
	}
}
