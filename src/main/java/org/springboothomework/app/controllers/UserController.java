package org.springboothomework.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@GetMapping("/user/signin")
	public String userSignIn(){
		return "pages-signin";
	}
	
	@GetMapping("/user/signup")
	public String userSignUp(){
		return "pages-signup";
	}
	
	@GetMapping("/user/profile")
	public String userProfile(){
		return "pages-user-profile";
	}
}
