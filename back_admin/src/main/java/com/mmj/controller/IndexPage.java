package com.mmj.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.mmj.model.User;
import com.mmj.server.IUserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/*******************************************************************************
 * Copyright (c) 2017 daixinlian.com
 *
 * All rights reserved. 
 *
 * Contributors:
 *   Miller Ming - Initial implementation
 *   2017/10/9
 *******************************************************************************/
@Controller
public class IndexPage {
    @Reference
    private IUserInfo userInfo;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getPage(){

        User user = new User();
        user.setAge(29);
        user.setName("miller");
        user.setGender(2);
        user.setId(1);
        user = userInfo.saveUser(user);
        System.out.println(JSON.toJSONString(user));

        return "index";
    }
}
