package com.woniu.web.controller.productController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.domain.Reduceprice;
import com.woniu.service.IReducepriceService;
@Controller
@RequestMapping("reduceprices")
public class ReducePriceController {
	@Autowired
	   private IReducepriceService service;
	@PostMapping
	@ResponseBody()
	public void save(Reduceprice reduceprice) {
		service.save(reduceprice);
	}
	@DeleteMapping
	@ResponseBody
	public void delete(Integer rid) {
		service.delete(rid);
	}
	@PutMapping
	@ResponseBody
	public void update(Reduceprice reduceprice) {
		service.update(reduceprice);
	}
	@GetMapping
	@ResponseBody
	public List<Reduceprice> findAll(){
		return service.select();
	}
	@GetMapping(value="{rid}")
	@ResponseBody
	public Reduceprice findOne(@PathVariable Integer rid) {
		return service.select(rid);
	}
}
