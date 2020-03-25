package com.cloud.account.controller;


import com.cloud.account.service.AccountFeignService;
import com.cloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
//    @Resource
//    private DiscoveryClient discoveryClient;
//
//    @RequestMapping("services")
//    public List<String> getServices(){
//        List<String> services = discoveryClient.getServices();
//        for (String service : services) {
//            log.info("Eureka Services: " + service);
//        }
//        return services;
//    }
//
//    @Resource
//    private AccountMapper accountMapper;
//
//    @GetMapping("account/{id}")
//    public Account getAccount(@PathVariable("id") Integer id){
//        return accountMapper.selectByPrimaryKey(1);
//    }

    @Resource
    private AccountFeignService accountFeignService;

    @Value("${server.port}")
    private String port;

    @GetMapping("consumer/account/payment/{id}")
    public Payment getPayByFeign(@PathVariable("id") Integer id){
        log.info("Feign : "+port);
        return accountFeignService.selectByPrimaryKey(id);
    }

}
