package com.haibo.dao;

import  com.haibo.model.User;


/*
 * 查询数据接口
 * @Author Haibo
 * */
public interface UserDao {
	/**
	 * 根据ID查询数据库数据
	 * @param userId 参数名（一定写对，和user2Mapper.xml文件中的userId对应）
	 * @return
	 */
	 public User selectUserById(Integer userId);
	 
	 /**
	  * 根据名字查询数据库
	  * @param name 参数名(一定写对，和user2Mapper.xml文件中的name对应)
	  * */
	 public User selectUserByName(String name);
}
