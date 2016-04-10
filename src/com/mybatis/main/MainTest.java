package com.mybatis.main;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mybatis.map.UserMap;
import com.mybatis.pojo.User;

public class MainTest {
	
	@Test
	public void save(){
		
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		UserMap um = (UserMap) con.getBean("userMap");
		User user = new User("zv", 17);
		um.save(user);
	}
	
}
