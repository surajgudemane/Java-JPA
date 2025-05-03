package com.project.airlines.contrroller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class AirlinesController {

	public static void main(String[] args) {
		System.out.println("hello [[[[[[[[[[[[[");
	}
	
	@RequestMapping("/save")
	public String onSave(Model model) {
		System.out.println("Hello............!");
		return "welcome.jsp";
	}
	
}
