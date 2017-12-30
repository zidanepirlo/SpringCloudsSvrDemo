package com.yuan.springcloud.service.service.Impl;

import com.yuan.springcloud.Interface.DefSCMQPushConsumerConcurrently;
import com.yuan.springcloud.Interface.RbMsgListener;
import com.yuan.springcloud.entity.ConsumerMsg;
import com.yuan.springcloud.service.service.IRocketMQService;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.exception.MQClientException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class RocketMQServiceImpl implements IRocketMQService{

    private final Logger logger = LoggerFactory.getLogger(RocketMQServiceImpl.class);

//    @Autowired
//    private DefSCMQPushConsumerConcurrently defSCMQPushConsumerConcurrently;

    @Override
    public void testDefPushConsumer() {


    }

    @PostConstruct
    public void init(){

//            defSCMQPushConsumerConcurrently.startup(
//                    new RbMsgListener(){
//
//                @Override
//                public void consumeMessage(List<ConsumerMsg> list) {
//
//                        for (ConsumerMsg consumerMsg:list){
//                            logger.info("receive msg:"+consumerMsg.getBody()+","+consumerMsg.getTopic()+","+consumerMsg.getTags());
//                        }
//                }
//            }
//            );

    }

}
