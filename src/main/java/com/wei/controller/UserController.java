package com.wei.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wei.entity.User;
import com.wei.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-05-01 11:22:00
 */
@CrossOrigin
@RestController
@RequestMapping("user")
public class UserController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 登录方法
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @PostMapping("login")
    public User login(String username,String password){
        return this.userService.login(username,password);
    }

    /**
     * 注册
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @PostMapping("regsitered")
    public boolean regsitered(String username,String password){
        return this.userService.regsitered(username,password);
    }
}