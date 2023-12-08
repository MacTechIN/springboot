package com.tutorials.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LogininController {
	@GetMapping("/login.do")
	public String login(HttpServletRequest req, Model model ) { 
		
		String uid = req.getParameter("uid");
		String pwd = req.getParameter("pwd");
		
		model.addAttribute("uid", uid);
		model.addAttribute("pwd", pwd);
		
		
		return "login";
		
	}

}
