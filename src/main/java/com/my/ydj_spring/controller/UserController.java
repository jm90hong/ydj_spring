package com.my.ydj_spring.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.ydj_spring.service.UserService;
import com.my.ydj_spring.vo.User;

@Controller
@RequestMapping(value="user")
public class UserController {

	
	@Autowired
	UserService userService;
	
	
	@GetMapping("save")
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
		
		userService.save(user);
		
		return "ok";
	}
	
}
