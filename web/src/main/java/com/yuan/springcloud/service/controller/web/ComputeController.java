package com.yuan.springcloud.service.controller.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.yuan.springcloud.service.domain.dao.IUserDao;
import com.yuan.springcloud.service.domain.entity.Grade;
import com.yuan.springcloud.service.domain.entity.User;
import com.yuan.springcloud.service.service.ITestService;
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
    private ITestService testService;

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
        User user = testService.getUserById(id);
        return user;
    }


    @RequestMapping(value = "/addUserAndGrade" ,method = RequestMethod.POST)
    @ResponseBody
    @HystrixCommand(fallbackMethod = "fallback",
            commandProperties = {
                    @HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")
            })
    public Boolean addUserAndGrade(String userId,String name,String gradeId,Integer grade_valeu) throws Exception{

        Boolean result = Boolean.TRUE;

        User user = new User();
        user.setId(userId);
        user.setName(name);

        Grade grade =  new Grade();
        grade.setGradeId(gradeId);
        grade.setUserId(userId);
        grade.setGradeValue(grade_valeu);

        try {
            testService.insertUserAndGrade(user, grade);
        }catch (Exception ex){
            logger.error(ex.getMessage(),ex);
            result = Boolean.FALSE;
            return result;
        }

        return result;
    }

    public  void  fallback(){
        logger.info("fallback");
    }

}