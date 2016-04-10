package com.mybatis.maintest;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mybatis.annotation.UserMapper;
import com.mybatis.pojo.MyBatisUtils;
import com.mybatis.pojo.User;

public class AnnotationTest {
	
	@Test
	public void getAllUser(){
		SqlSession session = MyBatisUtils.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> list= mapper.getAllUser();
		System.out.println(list);
	}
	
	
}
