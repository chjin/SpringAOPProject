package com.sist.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sist.dao.MyDataSource;

@Aspect
@Component
public class MyAspect {
	@Autowired
	private MyDataSource ms;
	
	@Before("execution(* com.sist.dao.BoardDAO.*(..))")
	public void getConnection(){
		ms.getConnection();
	}

	@After("execution(* com.sist.dao.BoardDAO.*(..))")
	public void disConnection(){
		ms.disConnection();
	}
	
}








