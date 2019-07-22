package com.gcj.mycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Mycloud_Zuul_9527_App {

    public static void main(String[] args) {
        SpringApplication.run(Mycloud_Zuul_9527_App.class, args);
    }
}
