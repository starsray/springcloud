package com.cloud.consul;

import com.cloud.consul.entity.UserInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties(UserInfo.class)
public class ConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulApplication.class,args);
    }

}
