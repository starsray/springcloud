package com.cloud.order.controller;

import com.cloud.order.dao.OrderRepository;
import com.cloud.order.entity.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/23 22:37
 */
@RestController
public class OrderController {
    @Resource
    private OrderRepository orderRepository;

    @GetMapping("getOrder")
    public List<Order> getOrderInfo() {
        List<Order> all = orderRepository.findAll();
        return all;
    }
}
