package com.my.ydj_spring.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.ydj_spring.service.UserService;
import com.my.ydj_spring.vo.User;

@Controller
@CrossOrigin
@RequestMapping(value="user")
public class UserController {

	
	@Autowired
	UserService userService;
	
	
	@GetMapping("all")
	@ResponseBody
	public List<User> save() {
		
		List<User> list = userService.findAll();
		
		return list;
	}
	
	
	@PostMapping("save")
	@ResponseBody
	public String save(
				@RequestParam(value="name") String name,
				@RequestParam(value="point") int point
			) {
		
		String uuid = UUID.randomUUID().toString();
		
		User user = new User();
		user.setUser_uuid(uuid);
		user.setName(name);
		user.setPoint(point);
		
		User result = userService.findByName(name);
		
		if(result == null) {
			//가입진행(이름 중복 안됨) 
			userService.save(user);
			return "ok";
		}else {
			//가입 불가능
			return "name";
		}
		
		
		
		
	}
}




