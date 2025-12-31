package com.zcp.spzx.manager;

import com.zcp.spzx.manager.properties.MinioProperties;
import com.zcp.spzx.manager.properties.UserProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {UserProperties.class, MinioProperties.class})

public class ManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagerApplication.class , args) ;
    }
}
