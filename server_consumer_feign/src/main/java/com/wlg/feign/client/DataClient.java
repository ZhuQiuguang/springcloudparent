package com.wlg.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ﻿qiuguang.zhu
 * @date 2021/1/22
 * 说明：
 */
@FeignClient(value = "TEST-PROVIDER")
@RequestMapping("provider")
public interface DataClient {
    
    @RequestMapping("get")
    public String getData();
    
}
