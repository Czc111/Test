package com.jbit.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/test")
	public Map<String,Object> index(){
		Map<String,Object> map = new HashMap<>();
		map.put("test01", "test01"); 
		map.put("test02", "test02");
		map.put("test03", "test03");
		return map;
	}
	
}
