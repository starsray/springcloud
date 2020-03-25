package com.cloud.payment.service;

import com.cloud.entity.Payment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/25 22:54
 */
@Service
public interface PaymentService {
    @GetMapping("provider/pay/{id}")
    public Payment selectByPrimaryKey(@PathVariable("id") Integer id);
}
