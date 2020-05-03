package com.wei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wei.dao.UserDao;
import com.wei.entity.User;
import com.wei.service.UserService;
import org.springframework.stereotype.Service;

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
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @Override
    public User login(String username, String password) {
        return this.getBaseMapper().findByUsernameAndPassword(username,password);
    }

    /**
     * 注册
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @Override
    public boolean regsitered(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return getBaseMapper().regsitered(user)>0;
    }
}