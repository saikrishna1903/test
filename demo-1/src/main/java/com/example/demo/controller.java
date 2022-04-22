package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class controller {
	
	@GetMapping("/test")
	public String hai() {
		return "krishna";
	}
	
	@GetMapping("/")
	public String hai1() {
		return "This is jenkins ci/cd";
	}
}
