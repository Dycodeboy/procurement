package com.wdsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wdsite.dao.UserMapper;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	UserMapper userDao;
	
	@RequestMapping(value="")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		System.out.println(userDao.selectAll().get(0));
		mav.setViewName("index/index");
		return mav;
	}

}
