package com.wdsite.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.wdsite.pojo.User;
import com.wdsite.service.UserService;

public class UserTest extends BaseTest {
	
	@Resource
	private UserService userService;
	
	@Test
	public void test() {
		List<User> list = userService.getUserAll();
		System.out.println(list.size());
	}

}
