package com.seig.zsy.service;

import com.seig.zsy.common.ResponseResult;
import com.seig.zsy.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 卓世源
 * @since 2024-05-19
 */
public interface ISysUserService extends IService<SysUser> {

    ResponseResult login(SysUser user);
}
