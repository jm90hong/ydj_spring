package com.my.ydj_spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.ydj_spring.vo.User;

@Repository
public class UserDao {

	
	@Autowired
	SqlSession s;
	
	
	public List<User> findAll(){
		return s.selectList("user.findAll");
	}
	
	public User findByName(String name) {
		return s.selectOne("user.findByName",name);
	}
	
	public int save(User user) {
		return s.insert("user.save",user);
	}
}
