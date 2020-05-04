package com.wei.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wei.dao.UserDao;
import com.wei.entity.Tag;
import com.wei.entity.User;
import com.wei.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2020-05-01 11:22:00
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 用户信息
     */
    @Override
    public User login(String username, String password) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.and(i -> i.eq("username", username).and(j -> j.eq("password", password)));
        return this.getBaseMapper().selectOne(wrapper);
    }

    /**
     * 注册
     *
     * @param username 用户名
     * @param password 密码
     * @return 布尔
     */
    @Override
    public boolean regsitered(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return getBaseMapper().regsitered(user) > 0;
    }

    /**
     * 通过用户名查询用户信息
     *
     * @param uid 用户id
     * @return 用户信息
     */
    @Override
    public User searchUserByUid(Integer uid) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("uid", uid);
        return getBaseMapper().selectOne(wrapper);
    }
}