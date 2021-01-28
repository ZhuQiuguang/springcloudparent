package com.wlg.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author ﻿qiuguang.zhu
 * @date 2021/1/22
 * 说明：
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class Application_Zuul {
    public static void main(String[] args) {
        SpringApplication.run(Application_Zuul.class);
    }
}
