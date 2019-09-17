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

import com.woniu.domain.Supplier;
import com.woniu.service.ISupplierService;
  
@RestController
@RequestMapping("/suppliers")
public class SupplierController {
	@Autowired
	private ISupplierService supplierService;
	@PutMapping("/save")
	public String save(Supplier supplier) {
		supplierService.save(supplier);
		return "true";
	}

	@DeleteMapping("/delete/{supplierid}")
	public String delete(@PathVariable("supplierid") int supplierid) {
		supplierService.delete(supplierid);
		return "true";
	}

	@PostMapping("/update")
	public String update(Supplier supplier) {
		supplierService.update(supplier);
		return "true";
	}

	@GetMapping("/findOne/{piid}")
	public Supplier findOne(@PathVariable("supplierid") int supplierid) {
		return supplierService.findOne(supplierid);
	}

	@GetMapping("/findAll")
	public List<Supplier> findAll() {
		return supplierService.findAll();
	}
}
