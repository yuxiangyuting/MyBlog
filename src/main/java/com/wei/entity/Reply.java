package com.wei.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 评论回复(Reply)表实体类
 *
 * @author makejava
 * @since 2020-05-03 19:56:41
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class Reply extends Model<Reply> {
    /**
    *回复评论id
    */
    private Integer repid;
    /**
    *被回复的用户id
    */
    private Integer uid;
    /**
    *回复内容
    */
    private String repname;
        private Integer likecount;
    /**
    *回复的文章id
    */
    private Integer artid;


    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.repid;
    }
    }