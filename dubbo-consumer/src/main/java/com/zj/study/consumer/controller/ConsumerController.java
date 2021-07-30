package com.zj.study.consumer.controller;

import com.zj.study.service.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/6/30 15:39
 * @Description:
 */
@RestController
@Slf4j
public class ConsumerController {

    @DubboReference
    ApiService apiService;

    @GetMapping("/hello")
    public String hello(String name) {
        return apiService.hello(name);
    }

}
