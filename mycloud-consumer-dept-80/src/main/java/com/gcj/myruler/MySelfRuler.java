package com.gcj.myruler;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRuler {
    @Bean
    public IRule myRuler(){
        //return new RandomRule();
        return new RandomRuleGCJ();
    }
}
