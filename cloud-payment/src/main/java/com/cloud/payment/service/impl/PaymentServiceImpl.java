package com.cloud.payment.service.impl;

import com.cloud.entity.Payment;
import com.cloud.payment.mapper.PaymentMapper;
import com.cloud.payment.service.PaymentService;
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

    @Override
    public Payment selectByPrimaryKey(Integer id) {
        return paymentMapper.selectByPrimaryKey(id);
    }
}
