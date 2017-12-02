package com.yuan.springcloud.service.common.util;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class RedisEnvironment {

    private final Logger logger = Logger.getLogger(getClass());

    @Inject
    private Environment environment;

    private String clusterNodes;
    private String host;
    private String serverPort;
    private String password;
    private String maxIdle;
    private String maxActive;
    private String maxWait;
    private String timeout;
    private String maxTotal;
    private String minIdle;
    private String maxRedirections;

    public RedisEnvironment(){
        logger.info("RedisEnvironment constructor");
    }

    @PostConstruct
    public void init(){
        logger.info("RedisEnvironment init");

        clusterNodes = environment.getProperty("redis.clusterNodes");
        host = environment.getProperty("redis.host");
        serverPort = environment.getProperty("redis.serverPort");
        password = environment.getProperty("redis.password");
        maxIdle = environment.getProperty("redis.maxIdle");
        maxActive = environment.getProperty("redis.maxActive");
        maxWait = environment.getProperty("redis.maxWait");
        timeout = environment.getProperty("redis.timeout");
        maxTotal = environment.getProperty("redis.maxTotal");
        minIdle = environment.getProperty("redis.minIdle");
        maxRedirections = environment.getProperty("redis.maxRedirections");

        logger.info("RedisEnvironment clusterNodes:"+clusterNodes);
        logger.info("RedisEnvironment host:"+host);
        logger.info("RedisEnvironment password:"+password);
        logger.info("RedisEnvironment maxIdle:"+maxIdle);
        logger.info("RedisEnvironment maxActive:"+maxActive);
        logger.info("RedisEnvironment maxWait:"+maxWait);
        logger.info("RedisEnvironment timeout:"+timeout);
        logger.info("RedisEnvironment maxTotal:"+maxTotal);
        logger.info("RedisEnvironment minIdle:"+minIdle);
        logger.info("RedisEnvironment maxRedirections:"+maxRedirections);
    }


}
