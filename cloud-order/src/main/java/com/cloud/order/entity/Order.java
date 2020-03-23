package com.cloud.order.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * order
 * @author 
 */
@Data
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
    @Id
    private Integer orderId;

    private String orderNo;

    private String userName;

    private static final long serialVersionUID = 1L;
}