package com.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vicente
 * @version 1.0
 * @date 2020/3/26 22:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private int code;
    private String msg;
    private T data;

    public CommonResult(int code,String msg){
        this(code,msg,null);
    }

}
