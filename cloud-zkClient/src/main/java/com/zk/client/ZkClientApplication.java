package com.zk.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/23 16:01
 */

/**
 * 使用zookeeper作为注册中心需要注意客户端要和server端版本保持一致
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZkClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZkClientApplication.class,args);
    }
}
