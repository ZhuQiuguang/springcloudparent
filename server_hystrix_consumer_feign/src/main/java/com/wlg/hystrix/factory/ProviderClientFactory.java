package com.wlg.hystrix.factory;

import com.wlg.hystrix.service.ProviderClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author ﻿qiuguang.zhu
 * @date 2021/1/28
 * 说明：
 */
@Component
public class ProviderClientFactory implements FallbackFactory<ProviderClient>{
    
    @Override
    public ProviderClient create(Throwable causer){
        return new ProviderClient() {
            @Override //不知道干嘛的
            public String get(String num) {
                return "Feign调用失败";
            }
        };
    }
}
