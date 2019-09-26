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

import com.woniu.domain.Supplier;
import com.woniu.service.ISupplierService;
  
@RestController
@RequestMapping("/suppliers")
public class SupplierController {
	@Autowired  
	private ISupplierService supplierService;
	@PostMapping("save")
	public void save(@RequestBody Supplier supplier) {
		supplierService.save(supplier);
	}  

	@DeleteMapping("delete")
	public void delete( int supplierid) {
		supplierService.delete(supplierid);
	}

	@PutMapping("update")
	public void update(Supplier supplier) {
		supplierService.update(supplier);
	}

	@GetMapping("findOne")
	public void findOne(@PathVariable("supplierid") int supplierid) {
		 supplierService.findOne(supplierid);
	}

	@GetMapping("findAll")
	public List<Supplier> findAll() {
		return supplierService.findAll();
	}
}
