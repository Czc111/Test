package com.jbit.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@RequestMapping("/index")
	public Map<String,Object> index(){
		Map<String,Object> map = new HashMap<>();
		map.put("code", "1000");
		map.put("msg", "SUCCESS");
		map.put("data", "第一次测试Git"); 
		return map;
	}
	
}
