/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synjones.eureka.server_one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *实现多个eureka，需要都启动否则会报连接错误，但不影响运行
 * @author hsd
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceOneApplication {
    //spirng boot的标准入口
    public static void main(String[] args) {
       SpringApplication.run(EurekaServiceOneApplication.class, args);
    }
}
