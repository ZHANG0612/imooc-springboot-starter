package com.imooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imooc.pojo.Resource;

@Controller
@RequestMapping("ftl")
public class FreemarkerController {

	@Autowired
	private Resource resource;
	
	@RequestMapping("/index")
	private String index(ModelMap modelMap){
		modelMap.addAttribute("resource",resource);
		return "freemarker/index";
	}
	
	@RequestMapping("center")
	private String center(){
		return "freemarker/doc/center";
	}
}
