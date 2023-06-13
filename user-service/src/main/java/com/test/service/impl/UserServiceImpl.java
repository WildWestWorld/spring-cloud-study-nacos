package com.test.service.impl;


import com.test.entity.user.User;
import com.test.mapper.UserMapper;
import com.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zzq
 * @date 2023年06月09日 9:51
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;


    @Override
    public User getUserById(int uid) {
        User user = userMapper.getUserByIdAPI(uid);
        return user;
    }
}
