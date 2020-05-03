package com.wei.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 评论(Topic)表实体类
 *
 * @author makejava
 * @since 2020-05-03 19:56:41
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class Topic extends Model<Topic> {
    /**
    *评论id
    */
    private Integer tid;
    /**
    *用户id
    */
    private Integer uid;
    /**
    *评论内容
    */
    private String content;
    /**
    *点赞数
    */
    private Integer like;
    /**
    *被评论的文章id
    */
    private Integer artid;


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