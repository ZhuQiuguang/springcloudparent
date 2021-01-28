package com.wlg.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ﻿qiuguang.zhu
 * @date 2021/1/27
 * 说明：
 */
@SpringBootApplication
@EnableEurekaClient
public class Application_Config_Provider {
    public static void main(String[] args) {
        SpringApplication.run(Application_Config_Provider.class);
    }
}
