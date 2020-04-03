package com.example.userservice.service.impl;

import com.example.userservice.dao.IUserRepository;
import com.example.userservice.entity.UserInfo;
import com.example.userservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author zhaolei
 * Create: 2020/2/18 11:11
 * Modified By:
 * Description:
 */
@Service
public class UserServiceImpl implements IUserService {

    private IUserRepository userRepository;

    @Autowired
    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserInfo findUserById(Integer id) {
        Optional<UserInfo> userInfoOptional = userRepository.findById(id);
        return userInfoOptional.orElse(null);
    }
}
