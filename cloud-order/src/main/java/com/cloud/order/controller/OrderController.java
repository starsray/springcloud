package com.cloud.order.controller;

import com.cloud.entity.Order;
import com.cloud.order.mapper.OrderMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/23 22:37
 */
@RestController
public class OrderController {

    @Resource
    private OrderMapper orderMapper;

    @GetMapping("order/{id}")
    public Order getAccount(@PathVariable("id") Integer id){
        return orderMapper.selectByPrimaryKey(1);
    }

}
