package com.wei.service.impl;

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
     * @return 所有文章
     */
    @Override
    public List<Article> findAll() {
        return getBaseMapper().findAll();
    }
}