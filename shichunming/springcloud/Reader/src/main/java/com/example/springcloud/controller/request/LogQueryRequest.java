package com.example.springcloud.controller.request;

import lombok.Data;

/**
 * @ClassName LogQueryRequest
 * @Description TODO
 * @Author 石心木PC
 * @create: 2024-06-23 15:46
 **/
@Data
public class LogQueryRequest {
    private String hostName;
    private String file;
}
