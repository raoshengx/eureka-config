package com.eureka.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心需要使用 EnableConfigServer
 */

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigApp {
    public static void main(String []args){
        SpringApplication.run(ConfigApp.class,args);
    }
}
