package com.zcp.spzx.order;

import com.zcp.spzx.common.anno.EnableUserTokenFeignInterceptor;
import com.zcp.spzx.common.anno.EnableUserWebMvcConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.zcp.spzx.feign.cart", "com.zcp.spzx.feign.user", "com.zcp.spzx.feign.product"})
@EnableUserTokenFeignInterceptor
@EnableUserWebMvcConfiguration
public class OrderApplication {

    public static void main(String[] args) {

        SpringApplication.run(OrderApplication.class , args) ;
    }

}