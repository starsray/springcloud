package com.cloud.account.entity;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


/**
 * account
 * @author 
 */
@Table(name="account")
@Data
public class Account implements Serializable {
    @Id
    private Integer id;

    private String username;

    private String password;

    private String address;

    private Integer age;

    private static final long serialVersionUID = 1L;
}