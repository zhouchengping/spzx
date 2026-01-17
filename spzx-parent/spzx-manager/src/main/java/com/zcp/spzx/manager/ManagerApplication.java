package com.zcp.spzx.manager;

import com.zcp.spzx.common.log.annotation.EnableLogAspect;
import com.zcp.spzx.manager.properties.MinioProperties;
import com.zcp.spzx.manager.properties.UserProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = {"com.zcp.spzx"})
@EnableConfigurationProperties(value = {UserProperties.class, MinioProperties.class})
@EnableScheduling
@EnableLogAspect

public class ManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagerApplication.class , args) ;
    }
}
