package com.hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		System.out.println("[HelloController] /hello");
		return "hello";
	}

	@GetMapping("/hello.do")
	public String hello(Model model) {
		System.out.println("[HelloController] /hello.do");
		model.addAttribute("message", "환영합니다.");
		return "hello";
	}

	@GetMapping("/helloimage.do")
	public String helloimage(Model model) {
		System.out.println("[HelloController] /helloimage.do");
		model.addAttribute("imagefile", "helloimg.jpg");
		return "helloimage";
	}

	@GetMapping("/hellobutton.do")
	public String hellobutton(Model model) {
		System.out.println("[HelloController] /hellobutton.do");
		model.addAttribute("imagefile", "helloimg.jpg");
		return "hellobutton";
	}

}
