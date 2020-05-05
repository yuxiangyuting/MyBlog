package com.wei.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wei.entity.User;
import com.wei.entity.vo.UserVo;
import org.apache.ibatis.annotations.Insert;
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
     *
     * @param user 用户信息
     * @return 成功行数
     */
    @Insert("insert into user (username,password) values(#{username},#{password})")
    int regsitered(User user);

    /**
     * 查找该用户的所有信息
     *
     * @param uid 用户id
     * @return 用户信息
     */
    @Select("select u.uid,username,u.joindate,TIMESTAMPDIFF(DAY,u.joindate,now()) regtime,u.nickname,u.eamil,u.signature,u.phonenumber,u.tximg,count(a.uid) acount from article a join user u on a.uid = u.uid where u.uid=#{uid}")
    UserVo searchUserInfo(long uid);

    /**
     * 查找该用户的所有信息
     *
     * @param nickname 用户昵称
     * @return 用户信息
     */
    @Select("select u.uid,username,u.joindate,TIMESTAMPDIFF(DAY,u.joindate,now()) regtime,u.nickname,u.eamil,u.signature,u.phonenumber,u.tximg,count(a.uid) acount from article a join user u on a.uid = u.uid where u.nickname=#{nickname}")
    UserVo searchUserInfoByNickname(String nickname);
}