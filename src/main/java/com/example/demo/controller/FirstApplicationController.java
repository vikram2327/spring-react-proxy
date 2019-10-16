package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Message;


@RestController
//@Controller
//@RequestMapping("/")
public class FirstApplicationController {

//	@RequestMapping(method = RequestMethod.GET)
//	@RequestMapping("/page")
//	@RequestMapping(value="/")
//	@RequestMapping("/")
//	public String hello() {
//		return "forword:static/index";
//		 return "hello world";
//	}
	
	@RequestMapping("/greeting")
    public Message greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Message(name);
    }
}
