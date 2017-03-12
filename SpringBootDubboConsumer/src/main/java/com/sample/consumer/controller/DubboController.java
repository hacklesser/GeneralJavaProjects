package com.sample.consumer.controller;

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
	
	@RequestMapping(value = "/sayHello", method = RequestMethod.GET)
	public void sayHello(){
		dubboService.printHello();
	}

}
