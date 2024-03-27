package com.test.service;

import com.test.entity.User;

/**
 * @author: qxd
 * @date: 2024/2/19
 * @description:
 */
public interface UserService {
    User getUserById(int uid);

    int getRemain(int uid);

    boolean setRemain(int uid, int count);
}