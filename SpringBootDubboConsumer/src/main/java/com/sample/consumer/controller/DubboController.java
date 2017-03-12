package com.sample.consumer.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.api.service.dubbo.DubboService;

@RestController
@RequestMapping(value = "/dubbo")
public class DubboController {
	
	@Autowired
	private DubboService dubboService;
	
	@RequestMapping(value = "/sayHello", method = RequestMethod.POST)
	public Map<String, String> sayHello(){
		dubboService.printHello();
		Map<String, String> map = new HashMap<>();
		map.put("url", "123");
		map.put("hh", "toxic");
		return map;
	}

}
