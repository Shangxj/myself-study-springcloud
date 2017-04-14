/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synjones.web.ui.user.feign;

import com.synjones.web.ui.user.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author hsd
 */
@FeignClient(name = "user-server")
public interface UserFeignClient {
  @RequestMapping("/{id}")
  public User findById(@PathVariable("id") Long id);

  @RequestMapping(value = "/user", method = RequestMethod.POST)
  public User getByParam(@RequestBody User user);
}
