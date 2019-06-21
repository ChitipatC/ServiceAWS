package com.aws.codestar.projecttemplates.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController{
	
	@RequestMapping(value = "/testService", method = RequestMethod.POST)
	public String testService(HttpServletRequest request) {
		
		return "response : In testService"+request.toString();
	}
}