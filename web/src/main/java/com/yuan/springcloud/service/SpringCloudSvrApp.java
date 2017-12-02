package com.yuan.springcloud.service;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.yuan.springcloud.service.domain.mapper.**")
public class SpringCloudSvrApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringCloudSvrApp.class).web(true).run(args);
	}

}
