package com.cloud.account.controller;


import com.cloud.account.mapper.AccountMapper;
import com.cloud.entity.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/23 14:43
 */
@RestController
@Slf4j
public class AccountController {
    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping("services")
    public List<String> getServices(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("Eureka Services: " + service);
        }
        return services;
    }

    @Resource
    private AccountMapper accountMapper;

    @GetMapping("account/{id}")
    public Account getAccount(@PathVariable("id") Integer id){
        return accountMapper.selectByPrimaryKey(1);
    }

}
