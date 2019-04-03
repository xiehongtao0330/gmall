package com.xht.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xht.gmall.bean.UserInfo;
import com.xht.gmall.service.UserService;
import com.xht.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> userInfoList() {
        return userInfoMapper.selectAll();
    }
}
