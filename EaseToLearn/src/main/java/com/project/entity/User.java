package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * Creation of User for login purpose
 * 
 */

@Entity
public class User {
	
	@Id
	private String userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	private String userGender;
	private String userMobile;
	
	public User() {
		super();
	}
	
	public User(String userId, String userName, String userEmail, String userPassword, String userGender,
			String userMobile) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userGender = userGender;
		this.userMobile = userMobile;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
		

}
