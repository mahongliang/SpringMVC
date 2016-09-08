package com.imooc.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloMvcController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String helloMvc(ModelMap model){
		model.addAttribute("message","HelloSprigMVC");
		return "hello";
	}

}
