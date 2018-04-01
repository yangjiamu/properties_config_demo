package com.study.springboot.properties_config_demo;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private Resource resource;

    @GetMapping(value = "test")
    public Resource test(){
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);
        return bean;
    }
}
