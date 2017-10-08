package com.mmj.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mmj.model.User;
import com.mmj.server.IUserInfo;

/*******************************************************************************
 * Copyright (c) 2017 daixinlian.com
 *
 * All rights reserved. 
 *
 * Contributors:
 *   Miller Ming - Initial implementation
 *   2017/10/8
 *******************************************************************************/
@Service
public class UserInfoImpl implements IUserInfo {
    public User saveUser(User user) {
        user.setAge(user.getAge()+2);
        user.setGender(1);
        user.setName("Miller");
        return user;
    }
}
