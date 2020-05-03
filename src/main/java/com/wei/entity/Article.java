package com.wei.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * (Essay)表实体类
 *
 * @author makejava
 * @since 2020-05-02 12:46:41
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class Article extends Model<Article> {
    //文章id
    private Integer eid;
    //标题
    private String title;
    //用户id
    private Integer uid;
    //发布时间
    private Date issuedate;
    //浏览量
    private Integer pageview;
    //评论id
    private Integer rid;
    //内容
    private String content;
    //图片
    private String image;


    }