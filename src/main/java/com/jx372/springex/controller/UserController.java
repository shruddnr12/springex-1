package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping( { "/join", "/dojoin" } )
	public String doJoin() {
		return "UserController:doJoin";
	}
	
	@RequestMapping( value={"/login", "/l"}, method=RequestMethod.GET )
	public String login(){
		return "/WEB-INF/views/login.jsp";
	}
	
	@RequestMapping( value="/login", method=RequestMethod.POST )
	public String login( 
		//@RequestParam( value="email", required=true, defaultValue="") String email,	
		//@RequestParam( value="password", required=true, defaultValue="") String password,	
		@ModelAttribute UserVo userVo ){
		System.out.println( userVo );
		return "redirect:/main";
	}	
	
}
