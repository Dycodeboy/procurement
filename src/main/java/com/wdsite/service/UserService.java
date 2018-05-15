package com.wdsite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdsite.dao.UserMapper;
import com.wdsite.pojo.User;

@Service
public class UserService {

	@Autowired
	UserMapper userDao;
	
	public List<User> getUserAll(){
		return userDao.selectAll();
	}
}
