package com.haibo.service;

import com.haibo.model.User;

/*
 * Service接口层（给UserDao分配任务）
 * @author Haibo
 * */
public interface UserService {
	User selectUserById(Integer userId);
	User selectUserByName(String name);
}
