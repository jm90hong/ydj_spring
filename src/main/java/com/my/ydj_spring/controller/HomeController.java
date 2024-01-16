package com.my.ydj_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	
	
	
	@GetMapping("market")
	public String market() {
		
		return "market";
	}
	
	
	
	
	
	
	
	
	@GetMapping("item")
	public String item(
				@RequestParam(value="id") String id,
				Model model
			) {
		
		
		String nickFromDB="jm1422";
		String telFromDB="01099361422";
		
		
		
		model.addAttribute("nick",nickFromDB);
		model.addAttribute("tel",telFromDB);
		
		
		return "home";
	}
	
	
	
	@GetMapping("saveUser")
	@ResponseBody
	public String saveUser(
				@RequestParam(value="id") String id,
				@RequestParam(value="pw") String pw
			) {
		
		
		System.out.println(id);
		
		
		
		
		return "ok";
	}
	
	
	
	
	@GetMapping("")
	public String home() {
		
		
		return "home";
	}
	
	
	@GetMapping("login")
	public String login() {
		
		
		return "login";
	}
	
	@GetMapping("restapi")
	public String restapi() {
		
		
		return "rest-api";
	}
	
	
	@GetMapping("todo-list")
	public String todoList() {
		
		return "todo-list";
	}
	
	@GetMapping("todo-detail")
	public String todoDetail(
				@RequestParam(value="todo_id") int id,
				Model model
			) {
		
		
		System.out.println(id);
		model.addAttribute("id",id);
		
		return "todo-detail";
	}
	
	
}
