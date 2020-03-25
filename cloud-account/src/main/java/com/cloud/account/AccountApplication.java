package com.cloud.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

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
@EnableFeignClients
@MapperScan("com.cloud.account.mapper")
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class,args);
    }
}
