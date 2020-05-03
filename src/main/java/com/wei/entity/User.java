package com.wei.entity;

import java.util.Date;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (User)表实体类
 *
 * @author makejava
 * @since 2020-05-01 11:22:00
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class User extends Model<User> {
    //主键
    private Integer id;
    //用户名
    private String username;
    //密码
    private String password;
    //注册时间
    private Date joindate;
    //昵称
    private String nickname;
    //邮箱
    private String eamil;
    //个性签名
    private String signature;
    //手机号
    private String phonenumber;
}