package com.wlg.hystrix.controller;

import com.wlg.hystrix.service.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ﻿qiuguang.zhu
 * @date 2021/1/28
 * 说明：
 */
@RestController
@RequestMapping("consumer")
public class HystrixConsumerController {
    
    @Autowired
    private ProviderClient providerClient;
    
    @GetMapping("get/{num}")
    public String get(@PathVariable("num") String num){
        String data = providerClient.get(num);
        data = "feign hystrix :" + data;
        return data;
        
    }
    
}
