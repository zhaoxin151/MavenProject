package com.haibo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haibo.dao.UserDao;
import com.haibo.model.User;



@Service
public class UserServiceImpl implements UserService {
	/*
	 * 注入UserDao
	 * */
	@Autowired
	private UserDao userDao;
	
	/*
	 *  操作UserDao 做数据库操作
	 */
	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);
	}
	
	/*
	 * 操作UserDao 做数据库的操作
	 */
	public User selectUserByName(String name) {
		return userDao.selectUserByName(name);
	}
}
