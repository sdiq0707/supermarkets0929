package com.woniu.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.service.IUserinfoService;

@RestController
@RequestMapping("/users")
public class LoginController {
	
	@PostMapping("/login")
	public Map<String,String> login(String username, String password) {
		
		System.out.println(username+":"+password);
		
		Subject subject = SecurityUtils.getSubject();
		
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		
		String path = "";
		try {
			subject.login(token);
			path = "/admin/index.html";
		} catch (AuthenticationException e) {
			// 身份验证失败
//			logger.info("用户身份验证失败");
			path = "/index.html";
		}
//		
//		if(subject.isAuthenticated()) {
////			 logger.info("用户登录成功");
//		}else {
////			 logger.info("用户登录失败");
//		}
		
		Map<String,String> map = new HashMap<>();
		map.put("path", path);
		
		return map;
	}

}
