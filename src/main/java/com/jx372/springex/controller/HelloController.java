package com.jx372.springex.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping( "/hello2" )
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping( "/hello2" )
	public ModelAndView hello2( 
		@RequestParam( "n" ) String name ) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject( "name", name );
		mav.setViewName( "/WEB-INF/views/hello.jsp" );
		
		return mav;
	}
	
	@RequestMapping( "/hello3" )
	public String hello3( 
		Model model,	
		@RequestParam( "n" ) String name ) {
		model.addAttribute( "name", name );
		return "/WEB-INF/views/hello.jsp";
	}
	
	/* 기술이 침투 했기 때문에 비추천 */
	@RequestMapping( "/hello4" )
	public void hello4( HttpServletRequest request, Writer out) 
		throws IOException {
		String name = request.getParameter( "name" );
		out.write( "<h1>Hello " + name + "</h1>" );
	}
}
