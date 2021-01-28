package com.wlg.consumer;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author ﻿qiuguang.zhu
 * @date 2021/1/28
 * 说明：
 */
@SpringBootApplication
@EnableEurekaClient
public class Application_Ribbon {
    public static void main(String[] args) {
        SpringApplication.run(Application_Ribbon.class);
    }
    
    @Bean
    @LoadBalanced //开启负载均衡功能 默认的是轮询
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    
    //修改默认的负载均衡策略 随机分配
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
