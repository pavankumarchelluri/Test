package com.login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="Login")
public class Login {
	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int Id;
	private String userName;
	private String password;
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	@Column(name="USERNAME",nullable=false,length=12)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Column(name="PASSWORD",length=8,nullable=false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
