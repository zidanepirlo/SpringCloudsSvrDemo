package com.yuan.springcloud.service.domain.dao.Impl;

import com.yuan.springcloud.service.domain.dao.IUserDao;
import com.yuan.springcloud.service.domain.entity.User;
import com.yuan.springcloud.service.domain.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private IUserMapper iUserMapper;

    @Override
    public User findUserById(String id) {
        return iUserMapper.findUserById(id);
    }

    @Override
    public int insertUser(User user) {
        return iUserMapper.insertUser(user);
    }
}
