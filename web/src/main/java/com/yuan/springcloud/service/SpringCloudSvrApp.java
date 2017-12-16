package com.yuan.springcloud.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
@MapperScan("com.yuan.springcloud.service.domain.mapper.**")
public class SpringCloudSvrApp {

	public static void main(String[] args) {
//		new SpringApplicationBuilder(SpringCloudSvrApp.class).web(true).run(args);
		SpringApplication.run(SpringCloudSvrApp.class, args);
	}

}
