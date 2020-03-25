package com.cloud.account.template;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/25 21:03
 */
@Configuration
public class Config {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
