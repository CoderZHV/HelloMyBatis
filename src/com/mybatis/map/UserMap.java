package com.mybatis.map;

import java.util.List;

import com.mybatis.pojo.User;

public interface UserMap {
	
	void save(User user);
	User selectByName(String name);
	List<User> getAllUser();
	
}
