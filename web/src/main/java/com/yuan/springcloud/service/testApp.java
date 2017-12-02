package com.yuan.springcloud.service;


import com.yuan.springcloud.service.service.ICacheService;
import com.yuan.springcloud.service.service.ITestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ComputeServiceApplication.class)
@WebAppConfiguration
public class testApp {

    @Autowired
    private ITestService testService;

    @Autowired
    private ICacheService cacheService;


    @Test
    public void testRedis(){

        cacheService.add("yuan","qing");
    }

}
