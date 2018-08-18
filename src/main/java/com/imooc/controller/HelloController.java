package com.imooc.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.Resource;

@RestController
public class HelloController {

	@Autowired
	private Resource resource;
	
	@RequestMapping("/hello")
	public Object Hello(){
		return "hello springboot~~~";
	}
	
	@RequestMapping("/getResource")
	private IMoocJSONResult getResource(){
		Resource bean=new Resource();
		BeanUtils.copyProperties(resource, bean);
		return IMoocJSONResult.ok(bean);
	}
}
