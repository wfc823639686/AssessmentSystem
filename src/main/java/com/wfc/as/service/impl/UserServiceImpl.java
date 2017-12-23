package com.wfc.as.service.impl;

import com.wfc.as.mapper.UserMapper;
import com.wfc.as.model.User;
import com.wfc.as.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Map login(User user) {
        return null;
    }
}
