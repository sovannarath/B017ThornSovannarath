package org.springboothomework.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DashBoardController {
	
	@RequestMapping(value="/dashboard", method=RequestMethod.GET)
	public @ResponseBody String dashboard(){
		return "dashboard";
	}
}
