package com.cloud.order.mapper;

import com.cloud.entity.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}