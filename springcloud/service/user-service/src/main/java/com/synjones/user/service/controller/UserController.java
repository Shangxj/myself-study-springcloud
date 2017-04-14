/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synjones.user.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hsd
 */
@RestController
public class UserController {

    @Autowired
    private DiscoveryClient discoveryClient;
//    @Autowired
//    private UserRepository userRepository;

    /**
     * 注：@GetMapping("/{id}")是spring 4.3的新注解等价于：
     *
     * @RequestMapping(value = "/id", method = RequestMethod.GET)
     * 类似的注解还有@PostMapping等等
     * @param id
     * @return user信息
     */
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
//        User findOne = this.userRepository.findOne(id);
        User findOne = new User();
        findOne.setId(id+"");
        findOne.setName("胡世党");
        return findOne;
    }

//    /**
//     * 本地服务实例的信息
//     *
//     * @return
//     */
//    @GetMapping("/instance-info")
//    public ServiceInstance showInfo() {
//        ServiceInstance localServiceInstance = this.discoveryClient.get.getLocalServiceInstance();
//        return localServiceInstance;
//    }

    @PostMapping("/user")
    public User getByParam(@RequestBody User user) {
        return user;
    }
}
