package com.mybatis.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mybatis.domain.User;
import com.mybatis.mapper.UserMapper;

public class MainApp {
	
	@Test
	public void selectTest(){
		
		ApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
		UserMapper um = (UserMapper)con.getBean("userMapper");
		
		User user = um.selectByName("zv");
		System.out.println(user);
	}
}
