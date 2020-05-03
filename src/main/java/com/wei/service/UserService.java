package com.wei.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wei.entity.User;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2020-05-01 11:22:00
 */
public interface UserService extends IService<User> {

    /**
     * 登录方法
     * @param username 用户名
     * @param password 密码
     * @return
     */
    User login(String username, String password);

    /**
     * 注册
     * @param username 用户名
     * @param password 密码
     * @return
     */
    boolean regsitered(String username, String password);

    /**
     * 通过用户名查询用户信息
     * @param username 用户名
     * @return 用户信息
     */
    User searchUserByUserName(String username);
}