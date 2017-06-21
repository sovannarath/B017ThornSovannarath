package org.springboothomework.app.controllers;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	//@RequestMapping(value="/user-cu", method=RequestMethod.GET)
	@GetMapping("/user-cu")
	public String userC(ModelMap mp){
		mp.addAttribute("USER",new User());
		return "user-cu";
	}
	
	//@RequestMapping(value="/user/list", method=RequestMethod.POST)
	@PostMapping("/user-list")
	public String userList(){
		return "user-list";
	}
}