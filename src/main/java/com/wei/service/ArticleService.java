package com.wei.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wei.entity.Article;
import com.wei.entity.vo.ArticleVo;

import java.util.List;

/**
 * (Essay)表服务接口
 *
 * @author makejava
 * @since 2020-05-02 12:46:41
 */
public interface ArticleService extends IService<Article> {

    /**
     * 通过id查询文章
     *
     * @param artId 文章id
     * @return 文章对象
     */
    ArticleVo selectByArtId(long artId);

    /**
     * 查找该uid的所有置顶的文章
     *
     * @param uid 用户id
     * @return 文章集合
     */
    List<Article> selectTopArticleByUid(long uid);

    /**
     * 查找该uid的所有不置顶的文章
     *
     * @param uid 用户id
     * @return 文章集合
     */
    List<Article> selectNoTopArticleByUid(long uid);

    /**
     * 添加文章
     *
     * @param article 文章信息
     * @return 布尔
     */
    boolean addArticle(Article article);

    /**
     * 查找所有置顶的文章
     *
     * @return 文章集合
     */
    List<Article> findAllTopArticle();

    /**
     * 查找所有不置顶的文章
     *
     * @return 文章集合
     */
    List<Article> findAllNoTopArticle();
}