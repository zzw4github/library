package me.zzw.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import me.zzw.library.service.HelloService;



@RestController
public class HelloController {
	@Autowired
	HelloService helloService;
	@GetMapping("/boot")
	public String hello() {
		Integer x = helloService.save();
		return "hello boot" +  x;
	}
	
//	@GetMapping("/query")
//	public @ResponseBody Users selectByID() {
//		return helloService.selectByID();
//	}

}
