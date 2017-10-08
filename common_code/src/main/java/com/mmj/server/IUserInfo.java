package com.mmj.server;


import com.mmj.model.User;

/*******************************************************************************
 * Copyright (c) 2017 daixinlian.com
 *
 * All rights reserved. 
 *
 * Contributors:
 *   Miller Ming - Initial implementation
 *   2017/10/8
 *******************************************************************************/
public interface IUserInfo {

    User saveUser(User user);

}
