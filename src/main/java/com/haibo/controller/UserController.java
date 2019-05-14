package com.haibo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haibo.model.User;
import com.haibo.service.UserService;
import com.mysql.jdbc.StringUtils;

/*
 * 控制层(目的是返给访问者数据)
 * @Author Haibo
 */

@Controller
public class UserController {
	/*
	 * 注入resource 配置
	 */
	@Resource
	private UserService userService;

	/**
	 * 访问入口，接收外界访问
	 * 
	 * @param name     接口参数
	 * @param password 接口参数
	 * @return 返回map, spring框架会解析成json格式
	 */
	@ResponseBody
	@RequestMapping(value = "/showUserInfo", method = RequestMethod.POST)
	public Map<String, Object> login(@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "password", required = true) String password) {
		User user = null;
		String message = "";
		String success = "";
		System.out.println(name);
		if (StringUtils.isNullOrEmpty(name) || StringUtils.isNullOrEmpty(password)) {
			success = "failed";
			message = "用户名和密码不能为空";
		} else {
			user = userService.selectUserByName(name);
			if (null == user) {
				success = "failed";
				message = "用户不存在";
			} else {
				if (password.equals(user.getUserPassword())) {
					success = "success";
					message = "祝贺登录成功";
				} else {
					success = "failed";
					message = "密码有误";
				}
			}
		}

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", success);
		map.put("message", message);
		return map;
	}
}
