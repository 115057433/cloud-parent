package com.cloud.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/test")
public class TestController {

	
	@ResponseBody
	@RequestMapping(value="/one")
	public String show() {
		return "成功";
	}
}
