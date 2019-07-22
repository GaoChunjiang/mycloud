package com.gcj.mycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient  //服务发现
@EnableCircuitBreaker  //hystrixR 熔断机制的支持
public class DeptProvider8001Hystrix_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001Hystrix_App.class, args);
    }
}
