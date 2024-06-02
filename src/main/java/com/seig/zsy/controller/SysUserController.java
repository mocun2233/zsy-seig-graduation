package com.seig.zsy.controller;


import com.seig.zsy.common.ResponseResult;
import com.seig.zsy.entity.SysUser;
import com.seig.zsy.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 卓世源
 * @since 2024-05-19
 */
@RestController
@RequestMapping("/sys-user")
public class SysUserController {
    @Autowired
    private ISysUserService loginService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody SysUser user) {
        return loginService.login(user);

    }
    @PostMapping("/logout")
    public ResponseResult logout() {
        loginService.logout();
        return ResponseResult.success(1);
    }
}
