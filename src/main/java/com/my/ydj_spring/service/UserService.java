package com.my.ydj_spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.ydj_spring.dao.UserDao;
import com.my.ydj_spring.vo.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	
	
	public List<User> findAll(){
		return userDao.findAll();
	}
	
	public User findByName(String name) {
		return userDao.findByName(name);
	}
	
	public int save(User user) {
		return userDao.save(user);
	}
	
}
