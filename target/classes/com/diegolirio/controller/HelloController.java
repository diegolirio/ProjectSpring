package com.diegolirio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value="ola")
	public String execute() {
		System.out.println("HelloController");
		return "index";
	}

}
