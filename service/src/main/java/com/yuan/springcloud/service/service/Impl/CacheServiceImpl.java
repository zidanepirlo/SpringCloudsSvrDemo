package com.yuan.springcloud.service.service.Impl;

import com.yuan.springcloud.service.common.util.JedisUtil;
import com.yuan.springcloud.service.service.ICacheService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CacheServiceImpl implements ICacheService{

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private JedisUtil jedisUtil;

    @Override
    public Boolean add(String key, String value) {

        Boolean addResult = Boolean.TRUE;
        try {
            long result = jedisUtil.getRedisSource().setnx(key, value);
            if (result != 1) {
                addResult = Boolean.FALSE;
            }
        } catch (Throwable e) {
            logger.error(e.getMessage(),e);
            addResult = Boolean.FALSE;
        }
        return addResult;
    }

    @Override
    public Boolean add(String key, String value, Date expiry) {
        Boolean addResult = Boolean.TRUE;
        try {
            long result = jedisUtil.getRedisSource().setnx(key, value);
            if (result == 1) {
                jedisUtil.getRedisSource().expire(key, (int) ((expiry.getTime() - System.currentTimeMillis()) / 1000));
            } else {
                addResult = Boolean.FALSE;
            }
        } catch (Throwable e) {
            logger.error(e.getMessage(),e);
            addResult = Boolean.FALSE;
        }
        return addResult;
    }

    @Override
    public Boolean set(String key, String value, Date expiry) {
        try {
            jedisUtil.getRedisSource().setex(key, (int) ((expiry.getTime() - System.currentTimeMillis()) / 1000), value);
        } catch (Throwable e) {
            logger.error(e.getMessage(),e);
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
