package com.wlg.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ﻿qiuguang.zhu
 * @date 2021/1/28
 * 说明：
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.wlg.hystrix.service") //忘了
public class Application_Hystrix_Consumer {
    public static void main(String[] args) {
        SpringApplication.run(Application_Hystrix_Consumer.class);
    }
}
