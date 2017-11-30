package com.yuan.springcloud.service.domain.mapper;


import com.yuan.springcloud.service.domain.entity.User;

import java.util.List;

public interface UserMapper {

    User findUserById(String id);

    int insertUser(User user);
}