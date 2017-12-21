package com.yuan.springcloud.service.common.util;


import lombok.Getter;
import lombok.Setter;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ConfigurationProperties(prefix = "spring.redis.cache")
@Setter
@Getter
public class RedisProperties implements InitializingBean {

    private final Logger logger = Logger.getLogger(getClass());

    private String clusterNodes;
    private String host;
    private String serverPort;
    private String password;
    private String maxIdle;
    private String maxActive;
    private String maxWait;
    private String commandTimeout;
    private String maxTotal;
    private String minIdle;
    private boolean testOnBorrow;
    private String maxRedirections;

    @Override
    public void afterPropertiesSet() throws Exception {

        logger.info("redis cluster init begin");
        logger.info("clusterNodes : "+clusterNodes);
        logger.info("host : "+host);
        logger.info("serverPort : "+serverPort);
        logger.info("password : "+password);
        logger.info("maxIdle : "+maxIdle);
        logger.info("maxActive : "+maxActive);
        logger.info("maxWait : "+maxWait);
        logger.info("commandTimeout : "+commandTimeout);
        logger.info("maxTotal : "+maxTotal);
        logger.info("minIdle : "+minIdle);
        logger.info("testOnBorrow : "+testOnBorrow);
        logger.info("maxRedirections : "+maxRedirections);
        logger.info("redis cluster init end");
    }

}
