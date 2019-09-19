package com.woniu.web.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.Sales;
import com.woniu.service.ISalesService;

@RestController
@RequestMapping("sales")
public class SalesController {
	@Autowired ISalesService service;
	@ResponseBody
	@PostMapping
	public void save(@RequestBody Sales sales) {
		System.out.println("SalesController.save()");
		service.save(sales);
	}
	@DeleteMapping
	public void delete(Integer saleid) {
		System.out.println("SalesController.delete()"+saleid);
		service.delete(saleid);
	}
	@PutMapping
	public void update(Sales sales) {
		System.out.println("SalesController.update()");
		service.update(sales);
	}
	@GetMapping(value = "{saleid}")
	public void findOne(@PathVariable Integer saleid ) {
		System.out.println("SalesController.findOne()");
		service.findOne(saleid);
	}
	@GetMapping
	public List<Sales> findAll() {
		List<Sales> list = service.findAll();
		System.out.println("SalesController.findAll()"+list);
		return list;
	}
}
