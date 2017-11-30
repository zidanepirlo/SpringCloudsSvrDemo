package com.yuan.springcloud.service.service;

import com.yuan.springcloud.service.domain.entity.Grade;
import com.yuan.springcloud.service.domain.entity.User;

public interface ITestService {

    void insertUserAndGrade(User user, Grade grade);

    User getUserById(String id);
}
