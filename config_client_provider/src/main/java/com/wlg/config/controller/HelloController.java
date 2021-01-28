package com.wlg.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ﻿qiuguang.zhu
 * @date 2021/1/27
 * 说明：
 */
@RestController
@RequestMapping("/config")
public class HelloController {
    
    @GetMapping("/hello")
    public String index(){
        return "我是一个数据！";
    }
    
}
