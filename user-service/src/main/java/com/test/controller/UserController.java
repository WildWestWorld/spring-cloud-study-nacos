package com.test.controller;

import com.test.entity.user.User;
import com.test.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zzq
 * @date 2023年06月09日 9:57
 */
@RestController
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/user/{uid}")
    public User GetUserById(@PathVariable("uid") int uid){
        User user =   userService.getUserById(uid);
        return user;
    }

}
