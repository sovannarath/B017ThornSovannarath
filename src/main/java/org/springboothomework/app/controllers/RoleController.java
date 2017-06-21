package org.springboothomework.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RoleController {

	@RequestMapping(value="/role-cu", method=RequestMethod.GET)
	public String roleCU(){
		return "role-cu";
	}
	
	@RequestMapping(value="/role-list", method=RequestMethod.POST)
	public String roleList(){
		return "role-list";
	}
}
