package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secures")
public class SecuredController {

	@RequestMapping()
	public String index() {
		return "Greetings from Spring Boot spring-boot-initial projektista!";
	}

	
	@RequestMapping("/hello")
	public String hello() {
		return "";
	}

	
	
//	class Test {
//		
//	}
}
