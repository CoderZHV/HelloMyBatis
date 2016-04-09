package com.mybatis.maintest;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.pojo.MyBatisUtils;
import com.mybatis.pojo.User;

public class MainApp {
	
	@Test
	public void firstDemo() {
		
		SqlSession session = MyBatisUtils.getSession();
		
		String arg = "com.mybatis.map.userMap.getUser";
		int num = session.insert(arg, new User(-1,"jane", 13));
		
		System.out.println(num);
		
	}
	
}
