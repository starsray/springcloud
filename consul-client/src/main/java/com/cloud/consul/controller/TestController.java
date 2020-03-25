package com.cloud.consul.controller;

import com.cloud.consul.entity.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/24 14:47
 */
@RestController
public class TestController {
    @Resource
    private ConfigBean configBean;

    @Value("${desc}")
    private String desc;

    @RequestMapping("/desc")
    public String desc(){
        return desc;
    }

    @RequestMapping("/config")
    public ConfigBean getUserInfo(){
        return configBean;
    }

}
