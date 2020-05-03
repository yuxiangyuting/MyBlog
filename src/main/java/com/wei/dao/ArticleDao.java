package com.wei.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wei.entity.Article;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * (Essay)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-02 12:46:41
 */
public interface ArticleDao extends BaseMapper<Article> {

    /**
     * 查询所有文章内容 根据时间排序
     * @return 所有文章
     */
    @Select("select * from article order by issuedate desc")
    List<Article> findAll();
}