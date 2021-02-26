package com.jgw.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Willis JiGW
 * @version v1.0.0
 * @date Created on 2:24 下午 2021/2/26
 * @desc
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan(basePackages = "com.jgw.mapper")
@EnableTransactionManagement
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}
