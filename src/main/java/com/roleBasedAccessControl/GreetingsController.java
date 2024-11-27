package com.roleBasedAccessControl;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/user")
	public String userEndPoint() {
		return "hello, User!";
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/admin")
	public String adminEndPoint() {
		return "hello, Admin!";
	}
}
