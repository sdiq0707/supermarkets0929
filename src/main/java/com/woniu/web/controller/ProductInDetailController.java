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
import com.woniu.domain.Productindetail;
import com.woniu.service.IProductINDetailService;
   
@RestController
@RequestMapping("/productInDetails")
public class ProductInDetailController {
	@Autowired  
	private IProductINDetailService productInDetailservice;

	@PostMapping("save")  
	public void save(@RequestBody Productindetail productindetail) {
		productInDetailservice.save(productindetail);
	}

	@DeleteMapping("delete")
	public void delete(int piid) {
		productInDetailservice.delete(piid);
	}

	@PutMapping("update")
	public void update(Productindetail productindetail) {
		productInDetailservice.update(productindetail);
	}

	@GetMapping("findOne")
	public void findOne(@PathVariable("piid") int piid) {
		 productInDetailservice.find(piid);
	}

	@GetMapping("findAll")
	public List<Productindetail> findAll() {
		return productInDetailservice.findAll();
	}

}
