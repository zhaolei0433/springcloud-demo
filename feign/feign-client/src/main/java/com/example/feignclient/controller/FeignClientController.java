package com.example.feignclient.controller;

import com.example.feignclient.model.Result;
import com.example.feignclient.model.UserInfo;
import com.example.feignclient.service.feign.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaolei
 * Create: 2020/2/18 15:27
 * Modified By:
 * Description:
 */
@RestController
@RequestMapping(value = "feignClient")
public class FeignClientController {

    private IUserService userService;

    @Autowired
    public FeignClientController(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "{userId}", method = RequestMethod.GET)
    public Result<UserInfo> getUserById(@PathVariable("userId") Integer userId) {
        return userService.getUserById(userId);
    }
}
