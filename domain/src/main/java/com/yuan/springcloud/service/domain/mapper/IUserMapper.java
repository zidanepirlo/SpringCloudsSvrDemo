package com.yuan.springcloud.service.domain.mapper;


import com.yuan.springcloud.service.domain.entity.User;

import java.util.List;

public interface IUserMapper {

    User findUserById(String id);

    int insertUser(User user);
}