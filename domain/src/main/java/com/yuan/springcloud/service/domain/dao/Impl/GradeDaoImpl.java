package com.yuan.springcloud.service.domain.dao.Impl;

import com.yuan.springcloud.service.domain.dao.IGradeDao;
import com.yuan.springcloud.service.domain.entity.Grade;
import com.yuan.springcloud.service.domain.mapper.GradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class GradeDaoImpl implements IGradeDao {

    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public int insert(Grade record) {
        return gradeMapper.insert(record);
    }
}
