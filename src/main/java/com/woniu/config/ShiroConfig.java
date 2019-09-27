package com.woniu.config;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.realm.jdbc.JdbcRealm.SaltStyle;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class ShiroConfig {

	@Bean
	public DruidDataSource dataSource() {
		
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://192.168.7.213:3306/supermarket");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		
		return dataSource;
	}
	
	@Bean
	public HashedCredentialsMatcher credentialsMatcher() {
		HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
		credentialsMatcher.setHashAlgorithmName("MD5");
		credentialsMatcher.setHashIterations(1024);
		
		return credentialsMatcher;
	}
	
	@Bean
	public JdbcRealm realm() {
		
		JdbcRealm realm = new JdbcRealm();
		realm.setDataSource(dataSource());
		// 认证
		realm.setAuthenticationQuery(" SELECT passwd,salt FROM userinfo WHERE userName=? ");
		//// 根据用户名查询角色
		realm.setUserRolesQuery(" SELECT roleName FROM userinforole ur\r\n" + 
				"INNER JOIN userinfo u ON ur.userID = u.userID\r\n" + 
				"INNER JOIN role r ON ur.roleID = r.roleID\r\n" + 
				"AND userName=? ");
		//// 根据角色名查询权限
		realm.setPermissionsQuery(" SELECT treeName FROM roletree rt \r\n" + 
				"INNER JOIN role r ON rt.roleID = r.roleID\r\n" + 
				"INNER JOIN tree t ON rt.treeID = t.treeID\r\n" + 
				"AND roleName=? ");
		// 支持权限查询(必须配置该项，否则无法判断用户拥有的角色是否拥有某个权限)
		// 这样才能，根据用户去查询用户的权限。
		realm.setPermissionsLookupEnabled(true);
		// 密码加密配置
		realm.setCredentialsMatcher(credentialsMatcher());
		// 必须加这个配置，否则对客户端传来的明文密码不进行解密
		realm.setSaltStyle(SaltStyle.COLUMN);
		
		return realm;
	}
	
	@Bean
	public DefaultWebSecurityManager securityManager() {
		
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(realm());
		return securityManager;
	}

	@Bean
	public ShiroFilterFactoryBean shiroFilter() {
		
		System.out.println("ShiroConfig.shiroFilter() 被訪問了!"+new Date());
		
		ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
		shiroFilter.setSecurityManager(securityManager());
		shiroFilter.setLoginUrl("/index.html");
		shiroFilter.setUnauthorizedUrl("/unauthorize.html");
		
		Map<String, String> map = new HashMap<>();
		map.put("/index.html", "anon");
		map.put("/register.html", "anon");
		map.put("/logout", "logout");
		
		map.put("/**", "anon");
		shiroFilter.setFilterChainDefinitionMap(map);
		
		return shiroFilter;
	}
	
}
