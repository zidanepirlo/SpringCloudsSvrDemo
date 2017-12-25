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
    private String serverPort;
    private String password;
    private String maxIdle;
    private String maxWait;
    private String timeout;
    private String maxTotal;
    private String minIdle;
    private Boolean testOnBorrow;
    private Boolean testOnReturn;
    private Boolean testWhileIdle;
    private String maxRedirections;
    private String minEvictableIdleTimeMillis;
    private String numTestsPerEvictionRun;
    private String softMinEvictableIdleTimeMillis;
    private String timeBetweenEvictionRunsMillis;

    @Override
    public void afterPropertiesSet() throws Exception {

        logger.info("redis cluster init begin");
        logger.info("clusterNodes : "+clusterNodes);
        logger.info("serverPort : "+serverPort);
        logger.info("password : "+password);
        logger.info("maxIdle : "+maxIdle);
        logger.info("maxWait : "+maxWait);
        logger.info("timeout : "+timeout);
        logger.info("maxTotal : "+maxTotal);
        logger.info("minIdle : "+minIdle);
        logger.info("testOnBorrow : "+testOnBorrow);
        logger.info("testOnReturn : "+testOnReturn);
        logger.info("testWhileIdle : "+testWhileIdle);
        logger.info("maxRedirections : "+maxRedirections);
        logger.info("minEvictableIdleTimeMillis : "+minEvictableIdleTimeMillis);
        logger.info("numTestsPerEvictionRun : "+numTestsPerEvictionRun);
        logger.info("softMinEvictableIdleTimeMillis : "+softMinEvictableIdleTimeMillis);
        logger.info("timeBetweenEvictionRunsMillis : "+timeBetweenEvictionRunsMillis);
        logger.info("redis cluster init end");
    }

}
