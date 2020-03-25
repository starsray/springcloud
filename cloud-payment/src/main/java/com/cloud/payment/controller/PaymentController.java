package com.cloud.payment.controller;

import com.cloud.entity.Payment;
import com.cloud.payment.mapper.PaymentMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/25 20:33
 */
@RestController
public class PaymentController {
    @Resource
    private PaymentMapper paymentMapper;

    @GetMapping("pay/{id}")
    public Payment getPayment(@PathVariable("id")Integer id){
        return paymentMapper.selectByPrimaryKey(id);
    }
}
