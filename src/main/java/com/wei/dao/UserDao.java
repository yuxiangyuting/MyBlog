package com.wei.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wei.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-01 11:22:00
 */
public interface UserDao extends BaseMapper<User> {

    /**
     * 用户注册
     * @param user 用户信息
     * @return 成功行数
     */
    @Insert("insert into user (username,password) values(#{username},#{password})")
    int regsitered(User user);
}