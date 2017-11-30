package com.yuan.springcloud.service.domain.dao;


import com.yuan.springcloud.service.domain.entity.User;

import java.util.List;

public interface IUserDao {

    User findUserById(String id);

    int insertUser(User user);
}