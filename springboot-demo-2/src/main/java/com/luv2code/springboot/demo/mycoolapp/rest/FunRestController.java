package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/home")
	public String sayHello()
	{
		return "Hello World! Time on Server is "+ LocalDateTime.now();
	}
	
	@GetMapping("/cis/api")
	public String sayciscall()
	{
		return "Hello proider bitsight!";
	}
}
