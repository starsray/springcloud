package com.cloud.consul.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/24 16:19
 */

@Data
@ConfigurationProperties(prefix = "db-config")
@Component
@RefreshScope
public class ConfigBean implements Serializable {
    private String driverClassName;
    private String url;
    private String userName;
    private String password;
}
