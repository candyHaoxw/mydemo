package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private DemoService ds;
	
	@RequestMapping("/test")
	public String test() {
		return "hello world!";
	}
	
	@RequestMapping("testDemo")
	public String testDemo() {
		return ds.getAll();
	}
}
