package com.learn.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learn.springboot.entity.Alien;

@Controller
public class HomeController {
	@RequestMapping(path = "/")
	public String home() {
		System.out.println("home page requested");
		return "index";
	}
	
	@RequestMapping(path = "/add" , method = RequestMethod.POST)
	public ModelAndView add(@RequestParam(required = true , name = "num1") final int num1 , @RequestParam(name="num2" , required = true) final int num2) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("result",num1+num2);
		return mv;
	}
	
	@GetMapping(path = "/getAliens")
	public ModelAndView getAliens(@RequestParam(required = true , name="alien_name") final String alienName) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		final Alien obj = new Alien("samrat" , "paul");
		mv.addObject("result",obj);
		return mv;
	}
}
