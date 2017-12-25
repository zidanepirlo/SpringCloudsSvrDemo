package com.yuan.springcloud.service.common.util;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

@Configuration
@EnableConfigurationProperties(RedisProperties.class)
public class JedisUtil implements InitializingBean {

    private final Logger logger = Logger.getLogger(getClass());

    @Inject
    private RedisProperties redisProperties;

    private JedisCluster jedisCluster;

    @Bean
    @Singleton
    public JedisCluster initRedisSource() {

        logger.info("init JedisCluster");
        String[] serverArray = redisProperties.getClusterNodes().split(",");
        Set<HostAndPort> nodes = new HashSet<>();

        for (String ipPort : serverArray) {

            String[] ipPortPair = ipPort.split(":");
            String ip = ipPortPair[0].trim();
            String port = ipPortPair[1].trim();
            nodes.add(new HostAndPort(ip, Integer.valueOf(port)));
        }

        jedisCluster = new JedisCluster(nodes, Integer.valueOf(redisProperties.getTimeout().trim())
                , Integer.valueOf(redisProperties.getMaxRedirections().trim()), getPoolConfig());
        return jedisCluster;
    }

    @Bean
    @Singleton
    public JedisPoolConfig getPoolConfig() {

        logger.info("init JedisPoolConfig");
        JedisPoolConfig poolConfig = new JedisPoolConfig();

        poolConfig.setMaxTotal(Integer.parseInt(redisProperties.getMaxTotal().trim()));
        poolConfig.setMinIdle(Integer.parseInt(redisProperties.getMinIdle().trim()));
        poolConfig.setMaxWaitMillis(Long.parseLong(redisProperties.getMaxWait().trim()));
        poolConfig.setMaxIdle(Integer.parseInt(redisProperties.getMaxIdle().trim()));
        poolConfig.setTestOnBorrow(redisProperties.getTestOnBorrow());
        poolConfig.setTestOnReturn(redisProperties.getTestOnReturn());
        poolConfig.setTestWhileIdle(redisProperties.getTestWhileIdle());
        poolConfig.setMinEvictableIdleTimeMillis(Long.parseLong(redisProperties.getMinEvictableIdleTimeMillis().trim()));
        poolConfig.setNumTestsPerEvictionRun(Integer.parseInt(redisProperties.getNumTestsPerEvictionRun().trim()));
        poolConfig.setSoftMinEvictableIdleTimeMillis(Long.parseLong(redisProperties.getSoftMinEvictableIdleTimeMillis().trim()));
        poolConfig.setTimeBetweenEvictionRunsMillis(Long.parseLong(redisProperties.getTimeBetweenEvictionRunsMillis().trim()));

        return poolConfig;
    }

    public JedisCluster getRedisSource() {
        return jedisCluster;
    }


    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @PreDestroy
    public void closeJedisCluster() {
        logger.info("closeJedisCluster start!");
        try {
            if (jedisCluster != null) {
                jedisCluster.close();
                logger.warn("JedisUtil πÿ±’redis¡¨Ω”!");
            }
        } catch (Throwable t) {
            logger.error("closeJedisCluster exception", t);
        }
    }
}
