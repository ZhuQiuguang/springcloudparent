package com.wlg.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ﻿qiuguang.zhu
 * @date 2021/1/22
 * 说明：
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.wlg.feign.client")
public class Application_Feign {
    public static void main(String[] args) {
        SpringApplication.run(Application_Feign.class);
    }
}
