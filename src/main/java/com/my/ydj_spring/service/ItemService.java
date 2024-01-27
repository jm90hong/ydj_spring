package com.my.ydj_spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.ydj_spring.dao.ItemDao;
import com.my.ydj_spring.vo.Item;

@Service
public class ItemService {

	@Autowired
	ItemDao itemDao;
	
	
	
	public List<Item> findAll(){
		
		return itemDao.findAll();
	}
	
	public int delete(int item_idx) {
		return itemDao.delete(item_idx);
	}
	
	public int save(Item item) {
		return itemDao.save(item);
	}
	
}
