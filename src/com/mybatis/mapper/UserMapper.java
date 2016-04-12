package com.mybatis.mapper;

import java.util.List;

import com.mybatis.domain.User;

public interface UserMapper {
	
	User selectByName(String name);
	
//	int insert(User user);
//	
//	int deleteByName(String name);
//	
//	int updateByName(String name);
//	
//	List<User> getAllUser();
}
