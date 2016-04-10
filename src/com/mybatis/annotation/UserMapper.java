package com.mybatis.annotation;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.mybatis.pojo.User;

public interface UserMapper {
	
	@Insert("insert into user(name,age) values(name=#{name},age=#{age})")
	public int addUser(User user);
	
	@Delete("detele from user where name=#{name}")
	public int deleteUser(String name);
	
	@Update("update user set name=#{name},age=#{age} where id=#{id}")
	public int updateUser(User user);
	
	@Select("select * from user where name=#{name}")
	public User selectUserByName(String name);
	
	@Select("select * from user")
	public List<User> getAllUser();
	
}
