package com.my.ydj_spring.vo;

public class User {
	
	private int user_idx=0;
	private String user_uuid=null;
	private String name=null;
	private int point=0;
	private String created_date=null;
	
	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getUser_idx() {
		return user_idx;
	}
	
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	
	
	
	public String getUser_uuid() {
		return user_uuid;
	}
	public void setUser_uuid(String user_uuid) {
		this.user_uuid = user_uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	
	
	
	
	
	
}
