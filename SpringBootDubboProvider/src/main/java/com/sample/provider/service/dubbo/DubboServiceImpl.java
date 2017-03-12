package com.sample.provider.service.dubbo;

import org.springframework.stereotype.Service;

import com.sample.api.service.dubbo.DubboService;

@Service(value = "dubboService")
public class DubboServiceImpl implements DubboService{

	@Override
	public void printHello() {
		System.out.println("hello dubbo!!!!!");
	}
	
}
