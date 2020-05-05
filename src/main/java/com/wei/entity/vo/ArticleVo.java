package com.wei.entity.vo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (Article)表实体类
 *
 * @author makejava
 * @since 2020-05-03 19:55:23
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class ArticleVo extends Model<ArticleVo> {
    /**
     * 文章id
     */
    private long artid;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 封面图片
     */
    private String image;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * 发布时间
     */
    private Date pushDate;
    /**
     * 浏览量
     */
    private long pageView;
    /**
     * 是否置顶
     */
    private Integer top;

    /**
     * 标签分类
     */
    private String tag;
    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.artid;
    }
}