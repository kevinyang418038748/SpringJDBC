package com.shxt.domain;

import java.io.Serializable;

public class User implements Serializable {
	
	private int id;
	private String username;
	private String nickname;
	private String password;
	
	private Group group;
	
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
	}
	public User(String username, String nickname, String password) {
		this.username = username;
		this.nickname = nickname;
		this.password = password;
	}
	
	
	

}
