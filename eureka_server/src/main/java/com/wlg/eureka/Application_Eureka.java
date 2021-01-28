package com.wlg.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ﻿qiuguang.zhu
 * @date 2021/1/20
 * 说明：
 */
@SpringBootApplication
@EnableEurekaServer
public class Application_Eureka {
    public static void main(String[] args) {
        SpringApplication.run(Application_Eureka.class);
    }
}
