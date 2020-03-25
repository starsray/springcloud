package com.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * tb_order
 * @author 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {

    private Integer tid;

    private String orderId;

    private String userName;

    private String orderName;

    private static final long serialVersionUID = 1L;
}