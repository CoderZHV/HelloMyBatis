package com.mybatis.maintest;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.pojo.MyBatisUtils;
import com.mybatis.pojo.User;

public class MainApp {
	
	@Test
	public void addUser() {
		
		SqlSession session = MyBatisUtils.getSession();
		
		String arg = "com.mybatis.map.userMap.addUser";
		int num = session.insert(arg, new User("jane", 18));
		session.commit();
		
		System.out.println(num);
		
	}
	
	@Test
	public void deleteUser(){
		
		SqlSession session = MyBatisUtils.getSession();
		
		String arg = "com.mybatis.map.userMap.deleteUser";
		int num = session.delete(arg, "jane");
		session.commit();
		System.out.println(num);
		
	}
	
	@Test
	public void updateUser(){
		
		SqlSession session = MyBatisUtils.getSession();
		
		String arg = "com.mybatis.map.userMap.updateUser";
		int num = session.update(arg, new User(2, "davi", 22));
		session.commit();
		System.out.println(num);
		
	}
	
	@Test
	public void getAllUser(){
		SqlSession session = MyBatisUtils.getSession();
		
		String arg = "com.mybatis.map.userMap.getAllUser";
		List<User> list = session.selectList(arg);
		System.out.println(list);
	}
	
}
