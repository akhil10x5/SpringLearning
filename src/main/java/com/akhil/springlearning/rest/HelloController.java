package com.akhil.springlearning.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/rest/hello")
public class HelloController
{

	@GetMapping
	public String getHello()
	{
		return "Hello World";
	}
}
