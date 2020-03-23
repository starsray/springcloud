package com.cloud.account.controller;

import com.cloud.account.util.DiscoveryUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/23 14:43
 */
@RestController
@Slf4j
public class AccountController {

    @Resource
    private DiscoveryUtils discoveryUtils;

    @GetMapping("getServices")
   public Object getServices(){
       Object services = discoveryUtils.getServices();
       return services;
   }
}
