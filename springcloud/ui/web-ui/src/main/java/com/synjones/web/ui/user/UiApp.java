/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synjones.web.ui.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 *
 * @author hsd
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class UiApp {

    public static void main(String[] args) {
        SpringApplication.run(UiApp.class, args);
    }
}
