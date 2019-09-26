package com.woniu.web.controller.statistics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.domain.Triple;
import com.woniu.service.ISalesDetailService;

@Controller
@RequestMapping("saleStatistics")
public class SaleStatisticsCOntroller {
	@Autowired
	private ISalesDetailService service;
	
	@PostMapping("high")
	@ResponseBody
	public Map high() {
		List<String> list = new ArrayList<>();
		List<Long> list2 = new ArrayList<>();
		List<Double> list3 = new ArrayList<>();
		List<Object> list4 = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		Map<String, Object> map2 = new HashMap<>();
		Map<String, Object> map3 = new HashMap<>();
		List<Triple<String, BigDecimal, Double>> detailList = service.findAllBySales();
		for (Triple<String, BigDecimal, Double> triple : detailList) {
			System.out.println(triple);
			list.add(triple.getA());
			list2.add(triple.getB().longValue());
			list3.add(triple.getC());
		}
		
		map2.put("name", "销售总金额");
		map2.put("type", "column");
		map2.put("yAxis", 1);
		map2.put("data", list3);
		
		map3.put("name", "销售总件数");
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
