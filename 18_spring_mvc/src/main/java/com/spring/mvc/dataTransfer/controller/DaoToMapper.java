package com.spring.mvc.dataTransfer.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.dataTransfer.dao.DataTransferDao;
import com.spring.mvc.dataTransfer.dto.ProductDto;

@Controller
@RequestMapping("/dataTransfer")
public class DaoToMapper {

	@Autowired
	private DataTransferDao dataTransferDao;
	
	// 예시 1) 단일 데이터 전송
	@RequestMapping(value="/getData1" , method=RequestMethod.GET)
	public String getData1() {
		dataTransferDao.getData1("user1");
		return "home";
	}
	
	// 예시 2) DTO 전송
	@RequestMapping(value="/getData2" , method=RequestMethod.GET)
	public String getData2() {
		
		ProductDto productDto = new ProductDto();
		productDto.setProductPrice(500000);
		productDto.setProductDeliveryPrice(0);
		
		dataTransferDao.getData2(productDto);
		
		return "home";
		
	}
	
	// 예시 3) MAP 전송
	@RequestMapping(value="/getData3" , method=RequestMethod.GET)
	public String getData3() {
		
		Map<String, Object> orderMap = new HashMap<String, Object>();
		orderMap.put("deliveryState", "배송준비중");
		orderMap.put("productDeliveryPrice", 0);
		dataTransferDao.getData3(orderMap);
		
		return "home";
		
	}
	
	@RequestMapping(value="/getData4" , method=RequestMethod.GET)
	public String getData4() {
		
		Map<String, String> orderMap = new HashMap<String, String>();
		orderMap.put("startDate", "2020-01-01");
		orderMap.put("endDate", "2020-12-31");
		
		dataTransferDao.getData4(orderMap);
		
		return "home";
		
	}
	
}


