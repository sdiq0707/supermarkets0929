package com.woniu.web.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.Userinfo;
import com.woniu.service.IUserinfoService;

@RestController
@RequestMapping("/users")
public class LoginController {
	
	@Autowired
	private IUserinfoService userService;
	
	@PostMapping("/login")
	public Map<String,Object> login(String username, String password) {
		
		System.out.println(username+":"+password);
		
		Subject subject = SecurityUtils.getSubject();
		
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		
		Map<String,Object> map = new HashMap<>();
		
		String path = "";
		try {
			subject.login(token);
			path = "/admin/index.html";
			map.put("status", 200);	//成功码
			map.put("path", path);	//跳转路径
			map.put("user", subject.getPrincipal());
		} catch (AuthenticationException e) {
			
//			logger.info("用户身份验证失败");
			
			path = "/index.html";
			map.put("status", 500);	//失败码
			map.put("path", path);	//跳转路径
		}
		
		
		
		
//		if(subject.isAuthenticated()) {
////			 logger.info("用户登录成功");
//		}else {
////			 logger.info("用户登录失败");
//		}
		
		return map;
	}
	
	@PostMapping("/register")
	public Map<String,Object> register(String username, String password) {
		
		System.out.println(username+":"+password);
		
		// 加密
		String salt = UUID.randomUUID().toString().replaceAll("-", "");
		SimpleHash sh = new SimpleHash("MD5", password, salt, 1024);
		Userinfo user = new Userinfo();
		user.setPasswd(sh.toHex());
		user.setSalt(salt);
		
		userService.save(user);
		
		Map<String,Object> map = new HashMap<>();
		map.put("path", "/index.html");		//注册完去登录页面
		map.put("status", 200);
		
		return map;
	}

}
