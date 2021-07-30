package com.zj.study.provider.service;

import com.zj.study.service.ApiService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/6/30 15:28
 * @Description:
 */
@DubboService
public class ApiServiceImpl implements ApiService {

    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}
