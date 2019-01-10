package com.ideata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GoToLoginController {
	@RequestMapping("/goToLogin")
	public ModelAndView GoToLogin()
	{
		ModelAndView mv = new ModelAndView();
		System.out.println("goToLogin controller");
		mv.setViewName("login.jsp");		
		return mv; 
	}
}
