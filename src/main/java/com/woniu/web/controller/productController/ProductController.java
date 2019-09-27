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

import com.woniu.domain.Product;
import com.woniu.service.IProductService;

@Controller
@RequestMapping("products")
public class ProductController {
@Autowired
   private IProductService service;
@PostMapping
@ResponseBody()
public void save(@RequestBody Product product) {
	service.save(product) ;
}
@DeleteMapping
@ResponseBody
public void delete(Integer productid) {
	System.out.println(productid);
	service.delete(productid);
}
@PutMapping
@ResponseBody
public void update(Product product) {
	service.update(product);
}
@GetMapping
@ResponseBody
public List<Product> findAll(){
	List<Product> list=service.select();
	return list;
}
@PutMapping("updown")
@ResponseBody
public void upAndDown(Integer productid) {
	System.out.println(productid);
	service.upAndDown(productid);
}
@PostMapping("sosu")
@ResponseBody
public List<Product> sosu(String name) {
	System.out.println(name);
	List<Product> list=service.select(name);
	return list;
}
}
