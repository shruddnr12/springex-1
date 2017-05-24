package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/* request mapping (type + method) */
@Controller
@RequestMapping( "/user" )
public class UserController {

	@ResponseBody
	@RequestMapping( "/joinform" )
	public String joinform() {
		return "UserController:joinform";
	}
	
	@ResponseBody
	@RequestMapping( "/join" )
	public String doJoin() {
		return "UserController:doJoin";
	}
	
	@RequestMapping( value="/login", method=RequestMethod.GET )
	public String login(){
		return "/WEB-INF/views/login.jsp";
	}
	
	@ResponseBody
	@RequestMapping( value="/login", method=RequestMethod.POST )
	public String login( @ModelAttribute UserVo userVo ){
		System.out.println( userVo );
		return "UserController:login(String, String)";
	}	
	
}
