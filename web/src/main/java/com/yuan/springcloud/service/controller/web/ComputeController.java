package com.yuan.springcloud.service.controller.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.yuan.springcloud.service.domain.dao.IUserDao;
import com.yuan.springcloud.service.domain.entity.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class ComputeController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @Autowired
    private IUserDao userDao;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    @ResponseBody
    @HystrixCommand(fallbackMethod = "fallback",
            commandProperties = {
            @HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")
    })
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }

    @RequestMapping(value = "/getUserById" ,method = RequestMethod.GET)
    @ResponseBody
    @HystrixCommand(fallbackMethod = "fallback",
            commandProperties = {
                    @HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")
            })
    public User getUserById(@RequestParam String id) {
        User user = userDao.findUserById(id);
        return user;
    }

    public  void  fallback(){
        logger.info("fallback");
    }

}