package com.zk.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/23 16:13
 */
@RestController
public class ZkTestController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("zk")
    public String getInfo(){
       return "spring cloud zookeeper:"+serverPort + UUID.randomUUID().toString();
    }
}
