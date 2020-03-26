package com.cloud.account.controller;


import com.cloud.account.service.AccountFeignService;
import com.cloud.entity.CommonResult;
import com.cloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("consumer/account/pay/{id}")
    public CommonResult<Payment> getPayByFeign(@PathVariable("id") Integer id){
        log.info("Feign : "+port);
        Payment payment = accountFeignService.selectByPrimaryKey(id);
        if(payment != null){
            return new CommonResult<Payment>(200,"成功",payment);
        }else{
            return new CommonResult<Payment>(500,"服务器暂时不可用，请稍后再试...");
        }
    }
}
