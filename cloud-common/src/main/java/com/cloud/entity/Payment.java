package com.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * tb_pay
 * @author 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private Integer id;

    private String payId;

    private String accId;

    private String orderId;

    private String payMoney;

    private String userName;

    private static final long serialVersionUID = 1L;
}