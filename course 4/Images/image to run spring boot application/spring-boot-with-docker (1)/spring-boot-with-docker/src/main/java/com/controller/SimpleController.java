package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@GetMapping(value = "/")	// http://localhost:9090/
	public String greeting() {
		return "Welcome to spring boot with docker created by akash kale";
	}
	
	@GetMapping(value = "say/{name}")	// http://localhost:9090/say/raj
	public String sayHello(@PathVariable("name") String name) {
		return "Welcome to spring boot with docker created by "+name;
	}
}
