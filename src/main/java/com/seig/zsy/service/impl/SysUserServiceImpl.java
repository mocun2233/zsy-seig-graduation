package com.seig.zsy.service.impl;

import com.seig.zsy.common.ResponseResult;
import com.seig.zsy.config.JwtUtil;
import com.seig.zsy.config.RedisCache;
import com.seig.zsy.entity.SysUser;
import com.seig.zsy.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seig.zsy.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
        implements ISysUserService {

    private final AuthenticationManager authenticationManager;
    private final RedisCache redisCache;
    private final JwtUtil jwtUtil;

    @Autowired
    public SysUserServiceImpl(AuthenticationManager authenticationManager,
                              RedisCache redisCache,
                              JwtUtil jwtUtil) {
        this.authenticationManager = authenticationManager;
        this.redisCache = redisCache;
        this.jwtUtil = jwtUtil;
    }

    @Override
    public ResponseResult login(SysUser user) {
        try {
            // 1. 认证管理器进行用户认证
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(user.getAccount(), user.getPassword())
            );

            // 2. 认证通过，利用 JwtUtil 生成 JWT，此处假设您的用户名为 JWT 的 subject
            final String jwt = JwtUtil.createJWT(authentication.getName());

            // 3. 将 JWT 存储到 Redis，这里象征性地设置过期时间为24小时
            redisCache.setCacheObject("USER_TOKEN:" + authentication.getName(), jwt, 24 * 3600, TimeUnit.SECONDS);

            // 4. 构建响应结果并返回
            return ResponseResult.success("登录成功", jwt);
        } catch (AuthenticationException e) {
            // 认证失败，构建失败的响应结果并返回
//            return ResponseResult.error("登录失败", e.getMessage());
            return ResponseResult.error(e.getMessage());

        }
    }

    public void logout() {
        // 获取当前认证信息
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            // 假设我们在JWT创建时，将JWT ID或者用户名作为键保存在Redis中
            String userName = authentication.getName();
            // 根据用户名删除Redis中的数据
//            StringRedisTemplate.("USER_TOKEN:" + userName);
        }
        // 清除认证信息
        SecurityContextHolder.getContext().setAuthentication(null);
    }
}