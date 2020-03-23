package com.cloud.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/23 13:35
 */

/**
 * EnableDiscoveryClient 可使用cloud适配的所有服务管理组件
 * EnableEurekaClient 只能在Eureka的服务管理组件中使用
 */

@SpringBootApplication
@EnableEurekaClient
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class,args);
    }
}
