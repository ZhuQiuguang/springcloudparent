package com.wlg.hystrix.service;

import com.wlg.hystrix.factory.ProviderClientFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ﻿qiuguang.zhu
 * @date 2021/1/28
 * 说明：
 */
//添加一个后备工厂，在失败时使用
@FeignClient(value = "TEST-HYSTRIX-PROVIDER",fallbackFactory = ProviderClientFactory.class)
@RequestMapping("provider")
public interface ProviderClient {
    
    @GetMapping("get/{num}")
    public String get(@PathVariable("num") String num);
}
