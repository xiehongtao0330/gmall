package com.xht.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xht.gmall.bean.UserInfo;
import com.xht.gmall.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    // dubbo远程注入
    @Reference
    UserService userService;

    @RequestMapping("userInfoList")
    public ResponseEntity<List<UserInfo>> userInfoList(){

        List<UserInfo> userInfoList = userService.userInfoList();

        return ResponseEntity.ok(userInfoList);
    }
}