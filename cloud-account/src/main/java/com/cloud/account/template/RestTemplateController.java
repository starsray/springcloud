package com.cloud.account.template;

import com.cloud.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Locale;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/25 16:06
 */
@RestController
@Slf4j
public class RestTemplateController {

    private final String url = "http://localhost:9003/"; //订单模块

    @Resource
    private RestTemplate restTemplate;

    /**
     * 使用RestTemplate远程调用订单模块方法
     * @return
     */
    @RequestMapping("account/rest/for/order/o")
    public Order getOrderByObject(){
        return  restTemplate.getForObject(url + "order/1", Order.class);
    }

    @GetMapping("account/rest/for/order/e")
    public Order getOrderByEntity(){
        ResponseEntity<Order> entity = restTemplate.getForEntity(url + "order/1", Order.class);
        int statusCodeValue = entity.getStatusCodeValue();
        Locale contentLanguage = entity.getHeaders().getContentLanguage();
        Order body = entity.getBody();
        log.info("statusCodeValue: "+statusCodeValue);
        log.info("contentLanguage: "+contentLanguage);
        log.info("body: "+body);
        return body;
    }

    @GetMapping("account/rest/for/order/entity")
    public ResponseEntity<Order> getOrderEntity(){
        return restTemplate.getForEntity(url + "order/1", Order.class);
    }
}
