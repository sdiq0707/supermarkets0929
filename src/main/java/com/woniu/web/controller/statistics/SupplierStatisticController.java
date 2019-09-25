package com.woniu.web.controller.statistics;

import java.math.BigDecimal;
import java.nio.channels.NonReadableChannelException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.Resource;

import org.aspectj.apache.bcel.generic.ReturnaddressType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hazelcast.internal.jmx.suppliers.LocalMapStatsSupplier;
import com.woniu.domain.Productindetail;
import com.woniu.domain.Triple;
import com.woniu.service.IProductINDetailService;
import com.woniu.service.ISupplierService;

@Controller
@RequestMapping("supplierStatistics")
public class SupplierStatisticController {
	@Resource
	private IProductINDetailService productINDetailService;

	@Resource
	private ISupplierService supplierService;

	@PostMapping("high")
	@ResponseBody
	public Map high() {
		System.out.println("SupplierStatisticController.high()");
		List<String> list = new ArrayList<>();
		List<Long> list2 = new ArrayList<>();
		List<Double> list3 = new ArrayList<>();
		List<Object> list4 = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		Map<String, Object> map2 = new HashMap<>();
		Map<String, Object> map3 = new HashMap<>();
		List<Triple<String, Long, Double>> detailList = productINDetailService.findAllByNull();
		for (Triple<String, Long, Double> triple : detailList) {
			System.out.println(triple);
			list.add(triple.getA());
			list2.add(triple.getB());
			list3.add(triple.getC());
		}
		
		map2.put("name", "供货总金额");
		map2.put("type", "column");
		map2.put("yAxis", 1);
		map2.put("data", list3);
		
		map3.put("name", "供货次数");
		map3.put("type", "spline");
		map3.put("yAxis", 0);
		map3.put("data", list2);
		
		list4.add(map2);
		list4.add(map3);
		
		map.put("categories", list);
		map.put("series", list4);
		return map;
	}
	
	@PostMapping("high2")
	@ResponseBody
	public Map high2(String sname) {
		System.out.println("SupplierStatisticController.high2()");
		List<String> list = new ArrayList<>();
		List<Long> list2 = new ArrayList<>();
		List<Double> list3 = new ArrayList<>();
		List<Object> list4 = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		Map<String, Object> map2 = new HashMap<>();
		Map<String, Object> map3 = new HashMap<>();
		List<Triple<String, BigDecimal, Double>> detailList = productINDetailService.findAllBySname(sname);
		for (Triple<String, BigDecimal, Double> triple : detailList) {
			System.out.println(triple);
			list.add(triple.getA());
			list2.add(triple.getB().longValue());
			list3.add(triple.getC());
		}
		
		map2.put("name", "商品供货总金额");
		map2.put("type", "column");
		map2.put("yAxis", 1);
		map2.put("data", list3);
		
		map3.put("name", "商品供货总件数");
		map3.put("type", "spline");
		map3.put("yAxis", 0);
		map3.put("data", list2);
		
		list4.add(map2);
		list4.add(map3);
		
		map.put("categories", list);
		map.put("series", list4);
		return map;
	}
	
	@PostMapping("high3")
	@ResponseBody
	public Map high3() {
		System.out.println("SupplierStatisticController.high3()");
		List<String> list = new ArrayList<>();
		List<Long> list2 = new ArrayList<>();
		List<Double> list3 = new ArrayList<>();
		List<Object> list4 = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		Map<String, Object> map2 = new HashMap<>();
		Map<String, Object> map3 = new HashMap<>();
		List<Triple<String, BigDecimal, Double>> detailList = productINDetailService.findAllByProduct();
		for (Triple<String, BigDecimal, Double> triple : detailList) {
			System.out.println(triple);
			list.add(triple.getA());
			list2.add(triple.getB().longValue());
			list3.add(triple.getC());
		}
		
		map2.put("name", "进货总金额");
		map2.put("type", "column");
		map2.put("yAxis", 1);
		map2.put("data", list3);
		
		map3.put("name", "进货件数");
		map3.put("type", "spline");
		map3.put("yAxis", 0);
		map3.put("data", list2);
		
		list4.add(map2);
		list4.add(map3);
		
		map.put("categories", list);
		map.put("series", list4);
		return map;
	}
	

}
