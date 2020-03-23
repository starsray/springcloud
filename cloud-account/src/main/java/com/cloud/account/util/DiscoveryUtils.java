package com.cloud.account.util;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/23 15:38
 */
@Component
public class DiscoveryUtils {
    @Resource
    private DiscoveryClient discoveryClient;

    public Object getServices(){
       return discoveryClient.getServices();
    }
}
