package com.wlg.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ﻿qiuguang.zhu
 * @date 2021/1/22
 * 说明：
 */
@RestController
@RequestMapping("provider")
public class ProviderController {
    @RequestMapping("get")
    public String getData(){
        return "提供了数据";
    }
}
