package com.my.ydj_spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.ydj_spring.vo.Item;

@Repository
public class ItemDao {

	
	@Autowired
	SqlSession s;
	
	
	public List<Item> findAll(){
		
		return s.selectList("item.findAll");
	}
	
	public int delete(int item_idx) {
		return s.delete("item.delete",item_idx);
	}
	
	public int save(Item item) {
		return s.insert("item.save",item);
	}
}
