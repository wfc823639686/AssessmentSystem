package com.wfc.as.controller;

import com.wfc.as.model.User;
import com.wfc.as.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("getById")
    public Object login(User user) {
        return userService.login(user);
    }
}
