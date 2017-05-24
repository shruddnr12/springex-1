package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( "/board" )
public class BoardController {

	@ResponseBody
	@RequestMapping( "/write" )
	public String write( 
		/*@RequestParam( "n" ) String name*/
		@RequestParam( value="n", required=true, defaultValue="" ) String name,
		@RequestParam( value="age", required=true, defaultValue="10" ) int age ){
		System.out.println( "name:" + name + "age:" + age );
		return "BoardController:write";
	}
	
	@ResponseBody
	@RequestMapping( "/update" )
	public String update( 
		@RequestParam String name ){
		/* 권장  @RequestParam( "name" ) String name */
		System.out.println( "name:" + name );
		return "BoardController:update";
	}	
}
