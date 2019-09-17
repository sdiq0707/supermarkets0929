package com.woniu.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.Sales;
import com.woniu.service.ISalesService;

@RestController
@RequestMapping("sales")
public class SalesController {
	@Autowired ISalesService service;
	@ResponseBody
	@PostMapping
	public void save(Sales sales) {
		System.out.println("SalesController.save()");
		service.save(sales);
	}
	@DeleteMapping
	public void delete(Integer saleid) {
		service.delete(saleid);
	}
	@PutMapping
	public void update(Sales sales) {
		service.update(sales);
	}
	@GetMapping(value = "{saleid}")
	public void findOne(@PathVariable Integer saleid ) {
		System.out.println("SalesController.findOne()");
		service.findOne(saleid);
	}
	@GetMapping
	public void findAll() {
		System.out.println("SalesController.findAll()");
		service.findAll();
	}
}
