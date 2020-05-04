package com.wei.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wei.dao.ArticleDao;
import com.wei.entity.Article;
import com.wei.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Essay)表服务实现类
 *
 * @author makejava
 * @since 2020-05-02 12:46:41
 */
@Service("essayService")
public class ArticleServiceImpl extends ServiceImpl<ArticleDao, Article> implements ArticleService {

    /**
     * 查询所有文章内容 根据时间排序
     *
     * @return 所有文章
     */
    @Override
    public List<Article> findAll() {
        return getBaseMapper().findAll();
    }

    /**
     * 通过id查询文章
     *
     * @param artId 文章id
     * @return 文章对象
     */
    @Override
    public Article selectByArtId(Integer artId) {
        QueryWrapper<Article> wrapper = new QueryWrapper<>();
        wrapper.eq("artId", artId);
        return getBaseMapper().selectOne(wrapper);
    }

    /**
     * 查找该uid的所有文章
     *
     * @param uid 用户id
     * @return 文章集合
     */
    @Override
    public List<Article> selectArticleByUid(Integer uid) {
        QueryWrapper<Article> wrapper = new QueryWrapper<>();
        wrapper.eq("uid", uid);
        return getBaseMapper().selectList(wrapper);
    }
}