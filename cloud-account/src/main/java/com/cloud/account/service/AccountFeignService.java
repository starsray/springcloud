package com.cloud.account.service;

import com.cloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/25 22:33
 */
@Service
@FeignClient("CLOUD-PAYMENT")
public interface AccountFeignService {

    @GetMapping("provider/pay/{id}")
    public Payment selectByPrimaryKey(@PathVariable("id") Integer id);
}
