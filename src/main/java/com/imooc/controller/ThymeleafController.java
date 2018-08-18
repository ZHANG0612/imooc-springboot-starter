package com.imooc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imooc.pojo.User;

@Controller
@RequestMapping("th")
public class ThymeleafController {

	@RequestMapping("/index")
	public String index(ModelMap modelMap){
		modelMap.addAttribute("name","thymeleaf-imooc");
		return "thymeleaf/index";
	}
	
	@RequestMapping("/center")
	public String center(){
		return "thymeleaf/doc/center";
	}
	
	@RequestMapping("/test")
	public String test(ModelMap modelMap){
		User u = new User();
		u.setName("lee");
		u.setAge(10);
		u.setPassword("123465");
		u.setBirthday(new Date());
		u.setDesc("<font color='green'><b>hello imooc</b></font>");
		
		modelMap.addAttribute("user", u);
		
		User u1 = new User();
		u1.setAge(19);
		u1.setName("imooc");
		u1.setPassword("123456");
		u1.setBirthday(new Date());
		
		User u2 = new User();
		u2.setAge(17);
		u2.setName("LeeCX");
		u2.setPassword("123456");
		u2.setBirthday(new Date());
		
		List<User> userList = new ArrayList<>();
		userList.add(u);
		userList.add(u1);
		userList.add(u2);
		
		modelMap.addAttribute("userList", userList);
		
        return "thymeleaf/test";
		
	}
	
	@RequestMapping("/postform")
	public String postform(User u){
		System.out.println("姓名："+u.getName());
		System.out.println("年龄："+u.getAge());
		return "redirect:/th/test";
	}
	
	@RequestMapping("/showerror")
	public String showerror(User u){
		int a=1/0;
		return "redirect:/th/test";
	}
}
