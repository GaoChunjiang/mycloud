package com.gcj.mycloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClentRest {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig(){
        String rst = "applicationName: "+applicationName+"\t eurekaServers: "+eurekaServers+"\t port: "+port;
        System.out.println("****** rst: "+ rst );
        return rst;
    }
}
