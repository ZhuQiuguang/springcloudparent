package com.wlg.feign.controller;

import com.wlg.feign.client.DataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ﻿qiuguang.zhu
 * @date 2021/1/22
 * 说明：
 */
@RestController
@RequestMapping("consumer")
public class DataFeignController {
    @Autowired
    private DataClient dataClient;
    
    @RequestMapping("feignGet")
    public String get(){
        return "Feign调用:" + dataClient.getData();
    }
}
