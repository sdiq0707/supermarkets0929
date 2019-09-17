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
import com.woniu.domain.Productindetail;
import com.woniu.service.IProductINDetailService;
  
@RestController
@RequestMapping("/productInDetails")
public class ProductInDetailController {
	@Autowired
	private IProductINDetailService productInDetailservice;

	@PutMapping("/save")
	public String save(Productindetail productindetail) {
		productInDetailservice.save(productindetail);
		return "true";
	}

	@DeleteMapping("/delete/{piid}")
	public String delete(@PathVariable("piid") int piid) {
		productInDetailservice.delete(piid);
		return "true";
	}

	@PostMapping("/update")
	public String update(Productindetail productindetail) {
		productInDetailservice.update(productindetail);
		return "true";
	}

	@GetMapping("/findOne/{piid}")
	public Productindetail findOne(@PathVariable("piid") int piid) {
		return productInDetailservice.find(piid);
	}

	@GetMapping("/findAll")
	public List<Productindetail> findAll() {
		return productInDetailservice.findAll();
	}

}
