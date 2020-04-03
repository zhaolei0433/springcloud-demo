package com.example.userservice.controller;

import com.example.userservice.entity.UserInfo;
import com.example.userservice.model.Result;
import com.example.userservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaolei
 * Create: 2020/2/18 11:12
 * Modified By:
 * Description:
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    private IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "{userId}", method = RequestMethod.GET)
    public Result<UserInfo> getUserById(@PathVariable("userId") Integer userId) {
        return new Result<>(userService.findUserById(userId));
    }
}
