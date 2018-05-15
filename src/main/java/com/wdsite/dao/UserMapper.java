package com.wdsite.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wdsite.pojo.User;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    User selectByPrimaryKey(Long id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}