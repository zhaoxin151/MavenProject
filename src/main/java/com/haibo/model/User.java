package com.haibo.model;

public class User {

	private Integer userId;    // 用户id
    private String userName;   // 用户名
    private String userPassword; // 用户密码
    
    // userID getter 方法
    public Integer getUserId() {
    	return userId;
    }
    
    // userId setter方法
    public void setUserId(Integer userId) {
		this.userId = userId;
	}
    
 // userName getter 方法
    public String getUserName() {
    	return userName;
    }
    
    // userName setter方法
    public void setUserName(String userName) {
		this.userName = userName;
	}
    
 // userPassword getter 方法
    public String getUserPassword() {
    	return userPassword;
    }
    
    // userPassword setter方法
    public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
    
}
