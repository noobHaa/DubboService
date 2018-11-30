package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.UserService;

/**
 * @Author ll
 * @Date 2018/10/29 15:14
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName() {
        return "tom";
    }
}
