package com.wei.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 评论系统(Reply)表实体类
 *
 * @author makejava
 * @since 2020-05-05 12:13:18
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class Reply extends Model<Reply> {
    /**
     * 评论id
     */
    private Long tid;
    /**
     * 用户id
     */
    private Long uid;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 用户头像
     */
    private String tximg;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 点赞数
     */
    private Long like;
    /**
     * 被评论的文章id
     */
    private Long artid;
    /**
     * 评论/回复时间
     */
    private Date tidate;
    /**
     * 回复的评论tid
     */
    @TableField(select = false)
    private Long parentId;
    /**
     * 子级回复列表
     */
    private List<Reply> child;

    /**
     * 一级评论id
     */
    private long replyId;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.tid;
    }
}