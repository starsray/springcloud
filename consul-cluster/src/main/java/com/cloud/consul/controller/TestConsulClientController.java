package com.cloud.consul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/23 20:46
 */
@RestController
public class TestConsulClientController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("consul")
    public String getInfo() {
        return "Spring Cloud Consul :"+serverPort + UUID.randomUUID().toString();
    }
}
