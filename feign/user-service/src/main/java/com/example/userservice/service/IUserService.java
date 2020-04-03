package com.example.userservice.service;

import com.example.userservice.entity.UserInfo;

/**
 * @author zhaolei
 * Create: 2020/2/18 11:11
 * Modified By:
 * Description:
 */
public interface IUserService {
    UserInfo findUserById(Integer id);
}
