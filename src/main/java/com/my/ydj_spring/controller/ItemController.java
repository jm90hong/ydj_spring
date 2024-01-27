package com.my.ydj_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.ydj_spring.service.ItemService;
import com.my.ydj_spring.vo.Item;

@Controller
@CrossOrigin
@RequestMapping(value="item")
public class ItemController {

	
	@Autowired
	ItemService itemService;
	
	@GetMapping("all")
	@ResponseBody
	public List<Item> all(){
		
			
		return itemService.findAll();
	}
	
	
	@PostMapping("save")
	@ResponseBody
	public String save(
				@RequestParam(value="name") String name,
				@RequestParam(value="user_idx") int user_idx,
				@RequestParam(value="price") int price,
				@RequestParam(value="count") int count
			) {
		
		
		Item item = new Item();
		item.setName(name);
		item.setUser_idx(user_idx);
		item.setPrice(price);
		item.setCount(count);
		
	
		itemService.save(item);
		
		return "ok";
	}
	
	
	@PostMapping("delete")
	@ResponseBody
	public String delete(
				@RequestParam(value="item_idx") int item_idx
				
			) {
		
		
		itemService.delete(item_idx);
		
		return "ok";
		
		
		
		
	}
}




