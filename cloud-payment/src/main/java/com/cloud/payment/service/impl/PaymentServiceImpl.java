package com.cloud.payment.service.impl;

import com.cloud.entity.Payment;
import com.cloud.payment.mapper.PaymentMapper;
import com.cloud.payment.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/25 22:55
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    @HystrixCommand(fallbackMethod = "selectByPrimaryKeyHandler")
    @Override
    public Payment selectByPrimaryKey(Integer id) {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return paymentMapper.selectByPrimaryKey(id);
    }

    public Payment selectByPrimaryKeyHandler(Integer id) {
        return new Payment();
    }

}
