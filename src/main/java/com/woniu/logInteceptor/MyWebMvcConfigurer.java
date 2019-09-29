package com.woniu.logInteceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {
	
	@Autowired
	private MyInterceptor myInterceptor;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(myInterceptor).addPathPatterns("/**")
//		.excludePathPatterns("/index.html","/js/**","/img/**","/fonts/**","/css/**","/layui/**","/layer/**");
	}
}
