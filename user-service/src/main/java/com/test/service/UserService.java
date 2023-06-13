package com.test.service;


import com.test.entity.user.User;

/**
 * @author zzq
 * @date 2023年06月09日 9:25
 */
public interface UserService {
    User getUserById(int uid);
}
