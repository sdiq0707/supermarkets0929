package com.woniu.logAop;

import java.net.InetAddress;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.woniu.domain.Tlog;
import com.woniu.service.ITlogService;

/*
 * * 日志切面类
 */

@Aspect
@Component
public class LogAspect {
	
	@Autowired
	private ITlogService service;
	
	// ..controller包及子包 所有方法执行切面,TlogController中的方法不执行切面
	@Pointcut("execution(public * com.woniu.web.controller..*.*(..))"+
			"&& !execution(public * com.woniu.web.controller.TlogController.*(..))")
	public void controllerCut() {} 	// 切入点
	
	
	@Pointcut("execution(public * com.woniu.service.impl..*.*(..))"+
			"&& !execution(public * com.woniu.service.impl.TlogServiceImpl.*(..))")
	public void serviceCut() {} 	// 切入点
	
	
	@Around("serviceCut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("log切面around增强织入.....");
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		
		// 角色 用户
		Integer roleId = 1001;
		Integer userId = 2002;
		// 日志类型
		String strType = "info";
		// 类名
		String className = pjp.getSignature().getDeclaringTypeName();
		String strClassName = className.substring(className.lastIndexOf(".")+1);
		// 方法名
		String methodName = pjp.getSignature().getName();
		// IP地址
		String IPAddress = InetAddress.getLocalHost().toString();
		String strIPAddress = IPAddress.substring(IPAddress.lastIndexOf("/")+1);
		// 操作日期
		Date createTime = new Date();
		// 描述
		String strMessage = userId+"执行了"+strClassName+"类的"+methodName+"方法";
		
		//=========================================================
		System.out.println(strClassName+"--"+strIPAddress+"--");
		
		Map<String,Object> data = new HashMap<>();
		data.put("URL", request.getRequestURL().toString());
		data.put("RemoteAddr", request.getRemoteAddr());
		data.put("ClassName", pjp.getSignature().getDeclaringTypeName());
		data.put("methodName", pjp.getSignature().getName());
		data.put("ServerName", request.getServerName()+"--"+request.getServerPort()+"--"+request.getServletPath()+"--"+request.getServletContext());
		data.put("ipAddress", InetAddress.getLocalHost().toString());
		//=========================================================
		
		Object result = pjp.proceed();
		
		String msg = insertLog(strType,strIPAddress,userId,strClassName,methodName,createTime,strMessage,roleId);
		System.out.println(msg);
		System.out.println(data);
		
		return result;
	}
	
	// 存入数据库
	public String insertLog(String strType,String strIPAddress, Integer userId,String strClassName,String methodName,Date createTime,String strMessage,Integer roleId) {
		// tlog存入数据库
		service.save(new Tlog(null,strType,strIPAddress,userId,strClassName,methodName,createTime,strMessage,roleId));
		return "日志保存成功！！！";
	}
	
}
