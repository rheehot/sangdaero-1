package com.sangdaero.walab.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public String userPage() {
		return "html/user.html";
	}


}
