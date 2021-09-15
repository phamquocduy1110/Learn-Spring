package com.trungtamjava.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	/* @RequestMapping(value="/", method=RequestMethod.GET) 
	 * This a method call path of template
	 * We can use @GetMappig for call path. It's faster and we don't need method inside
	 * @GetMapping is a new annotation in Spring Boot
	*/
	@GetMapping(value="/")
	public String home(HttpServletRequest request) {
		request.setAttribute("msg", "Hello Wordl Spring Boot");
		return "index";
	}
}
