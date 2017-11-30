package com.yuan.springcloud.service.domain.dao.Impl;

import com.yuan.springcloud.service.domain.dao.IUserDao;
import com.yuan.springcloud.service.domain.entity.User;
import com.yuan.springcloud.service.domain.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private UserMapper iUserMapper;

    @Override
    public User findById(String id) {
        return iUserMapper.findUserById(id);
    }

    @Override
    public int insert(User user) {
        return iUserMapper.insertUser(user);
    }
}
