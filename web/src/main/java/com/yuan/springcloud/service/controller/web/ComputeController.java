package com.yuan.springcloud.service.controller.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.yuan.springcloud.Interface.DefSCMQProducer;
import com.yuan.springcloud.Interface.DefSCMQPushConsumerConcurrently;
import com.yuan.springcloud.service.domain.dao.IUserDao;
import com.yuan.springcloud.service.domain.entity.Grade;
import com.yuan.springcloud.service.domain.entity.User;
import com.yuan.springcloud.service.service.ICacheService;
import com.yuan.springcloud.service.service.ITestService;
import org.apache.commons.lang.StringUtils;
import org.apache.rocketmq.client.producer.SendResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ComputeController {

    private final Logger logger = LoggerFactory.getLogger(ComputeController.class);

    @Autowired
    private DiscoveryClient client;

    @Autowired
    private ITestService testService;

    @Autowired
    private ICacheService cacheService;

    @Autowired
    private RestTemplate template;

//    @Autowired
//    private DefSCMQProducer defSCMQProducer;


//    @RequestMapping(value = "/testDefSCMQProducer" ,method = RequestMethod.GET)
//    @ResponseBody
//    public String testDefSCMQProducer(){
//
//        SendResult sendResult = null;
//        try {
//            sendResult = defSCMQProducer.sendMsg("yuan"+(new java.util.Random()).nextInt(),"qing"+(new java.util.Random()).nextInt());
//        }catch (Exception ex){
//            logger.error(ex.getMessage(),ex);
//            return "fail";
//        }
//        return sendResult == null? "fail":sendResult.toString();
//    }

    @RequestMapping(value = "/dependencyTest" ,method = RequestMethod.GET)
    @ResponseBody
    @HystrixCommand(fallbackMethod = "dependencyTestFallback",
            commandProperties = {
                    @HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")
            })
    public User dependencyTest(@RequestParam String id) throws Exception{

        try{
            Map<String, Object> uriVariables = new HashMap<String, Object>();
            uriVariables.put("id", "1");
            User user = this.template.getForObject("http://localhost:5555/demo2/getUserById?id={id}",User.class,uriVariables);
//            User user = this.template.getForObject("http://localhost:4111/getUserById?id={id}",User.class,uriVariables);
            logger.info("dependencyTest, user={}",user);
            return user;
        }catch (Exception ex){
            logger.error("系统内部异常！");
            logger.error(ex.getMessage(),ex);
            throw new Exception("系统内部异常！",ex);
        }
    }

    public  User  dependencyTestFallback(@RequestParam String id){
        logger.error("dependencyTestFallback, id={}",id);
        return null;
    }

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    @ResponseBody
    @HystrixCommand(fallbackMethod = "addFallback",
            commandProperties = {
            @HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")
    })
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }

    public  Integer  addFallback(@RequestParam Integer a, @RequestParam Integer b){
        logger.error("addFallback");
        return 0;
    }

    @RequestMapping(value = "/getUserById" ,method = RequestMethod.GET)
    @ResponseBody
    @HystrixCommand(fallbackMethod = "getUserByIdFallback",
            commandProperties = {
                    @HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")
            })
    public User getUserById(@RequestParam String id) {
        User user = testService.getUserById(id);
        logger.info("getUserById user={}",user);
        return user;
    }

    User  getUserByIdFallback(@RequestParam String id){
        User user = new User();
        user.setId("0000");
        user.setName("0000");
        logger.error("getUserByIdFallback");
        return user;
    }


    @RequestMapping(value = "/addUserAndGrade" ,method = RequestMethod.POST)
    @ResponseBody
    @HystrixCommand(fallbackMethod = "addUserAndGradeFallback",
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

    public Boolean addUserAndGradeFallback(String userId,String name,String gradeId,Integer grade_valeu){
        logger.error("addUserAndGradeFallback");
        return Boolean.FALSE;
    }

    @RequestMapping(value = "/testRedis" ,method = RequestMethod.GET)
    @ResponseBody
    @HystrixCommand(fallbackMethod = "testRedisFallback",
            commandProperties = {
                    @HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")
            })
    public String testRedis(@RequestParam String key){
       String value =  cacheService.get(key);
       logger.info("testRedis,key={}, value={}",key,value);
       return value;
    }


    public String testRedisFallback(@RequestParam String key){
        logger.error("testRedisFallback, key={}",key);
        return null;
    }

}