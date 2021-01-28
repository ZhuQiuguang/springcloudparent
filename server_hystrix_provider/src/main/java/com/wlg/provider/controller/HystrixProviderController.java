package com.wlg.provider.controller;

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
@RequestMapping("provider")
public class HystrixProviderController {
    
    @GetMapping("get/{num}")
    public String get(@PathVariable("num") Integer num){
        if(num == 123){
            throw new RuntimeException("FAILED");
        }
        return num + "==SUCCEED";
    }
    
}
