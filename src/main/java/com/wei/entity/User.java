package com.wei.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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

    /**
     * 主键
     */
    @TableId
    private Integer uid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    @TableField(select = false)
    private String password;

    /**
     * 注册时间
     */
    private Date joindate;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 邮箱
     */
    private String eamil;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 手机号
     */
    private String phonenumber;

    /**
     *头像
     */
    private String tximg;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.uid;
    }
}