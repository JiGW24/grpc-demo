package com.jgw.controller;

import com.jgw.service.GrpcClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Willis JiGW
 * @version v1.0.0
 * @date Created on 2:20 下午 2021/2/26
 * @desc
 */
@RestController
public class GrpcClientController {

    @Autowired
    private GrpcClientService grpcClientService;

    @RequestMapping("/")
    public String test(@RequestParam(defaultValue = "Willis") String name) {
        return grpcClientService.sendMessage(name);
    }
}

