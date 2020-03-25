package com.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * tb_account
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable {

    private Integer tid;

    private String userName;

    private String password;

    private String address;

    private Integer age;

    private String userid;

    private static final long serialVersionUID = 1L;
}