package com.wlg.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ﻿qiuguang.zhu
 * @date 2021/1/22
 * 说明：
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {
    //资源路径
    private final String url = "http://127.0.0.1:8001/provider/get";
    
    @RequestMapping("get")
    public String get(){
        RestTemplate template = new RestTemplate();
        String data = template.getForObject(url,String.class);
        return "获取到数据：" + data;
    }
}
