package com.roleBasedAccessControl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}