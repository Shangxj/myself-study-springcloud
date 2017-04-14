/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synjones.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *单服务模式
 * @author hsd
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {
    //spirng boot的标准入口
    public static void main(String[] args) {
       SpringApplication.run(EurekaServiceApplication.class, args);
    }
}
