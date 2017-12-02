package com.yuan.springcloud.service.service.Impl;

import com.yuan.springcloud.service.domain.dao.IGradeDao;
import com.yuan.springcloud.service.domain.dao.IUserDao;
import com.yuan.springcloud.service.domain.entity.Grade;
import com.yuan.springcloud.service.domain.entity.User;
import com.yuan.springcloud.service.service.ITestService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestServiceImpl implements ITestService {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private IUserDao userDao;

    @Autowired
    private IGradeDao gradeDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = false,rollbackFor = Exception.class)
    public void insertUserAndGrade(User user, Grade grade) {
        userDao.insert(user);
        gradeDao.insert(grade);
    }

    @Override
    public User getUserById(String id) {
        return userDao.findById(id);
    }
}
