package com.bajinfan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootTest {

	@RequestMapping("hello")
	public String hello() {
		return "王家鑫是好大儿";
	}
}
