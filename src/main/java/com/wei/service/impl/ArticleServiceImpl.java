package com.wei.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wei.dao.ArticleDao;
import com.wei.entity.Article;
import com.wei.service.ArticleService;
import org.springframework.stereotype.Service;

import java.io.*;
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
        Article article = getBaseMapper().selectOne(wrapper);
        try {
            FileReader reader = new FileReader(article.getContent());
            StringBuffer sb = new StringBuffer();
            char[] world = new char[8];
            int a = reader.read(world);
            while (a != -1) {
                sb.append(world);
                a = reader.read(world);
            }
            article.setContent(new String(sb));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return article;
    }

    /**
     * 查找该uid的所有置顶文章
     *
     * @param uid 用户id
     * @return 文章集合
     */
    @Override
    public List<Article> selectTopArticleByUid(Integer uid) {
        QueryWrapper<Article> wrapper = new QueryWrapper<>();
        wrapper.and(i -> i.eq("uid", uid).and(j -> j.eq("top", 1)));
        List<Article> articles = getBaseMapper().selectList(wrapper);
        FileReader reader = null;
        StringBuffer sb = null;
        char[] world = null;
        try {
            for (Article article : articles) {
                reader = new FileReader(article.getContent());
                sb = new StringBuffer();
                world = new char[8];
                int a = reader.read(world);
                while (a != -1) {
                    sb.append(world);
                    a = reader.read(world);
                }
                String str = sb.substring(0, 60);
                article.setContent(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return articles;
    }

    /**
     * 查找该uid的所有不置顶文章
     *
     * @param uid 用户id
     * @return 文章集合
     */
    @Override
    public List<Article> selectNoTopArticleByUid(Integer uid) {
        QueryWrapper<Article> wrapper = new QueryWrapper<>();
        wrapper.and(i -> i.eq("uid", uid).and(j -> j.eq("top", 0)));
        List<Article> articles = getBaseMapper().selectList(wrapper);
        FileReader reader = null;
        StringBuffer sb = null;
        char[] world = null;
        try {
            for (Article article : articles) {
                reader = new FileReader(article.getContent());
                sb = new StringBuffer();
                world = new char[8];
                int a = reader.read(world);
                while (a != -1) {
                    sb.append(world);
                    a = reader.read(world);
                }
                String str = sb.substring(0, 60);
                article.setContent(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return articles;
    }

    /**
     * 添加文章
     *
     * @param article 文章信息
     * @return 布尔
     */
    @Override
    public boolean addArticle(Article article) {
        File file = new File("src/main/resources/userData/" + article.getUid() + "/article/" + article.getArtid() + "/" + article.getTitle() + ".md");
        String acontent = article.getContent();
        try {
            FileOutputStream fos = new FileOutputStream(file, false);
            fos.write(acontent.getBytes("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        article.setContent("src/main/resources/userData/" + article.getUid() + "/article/" + article.getArtid() + "/" + article.getTitle() + ".md");
        return getBaseMapper().insert(article) > 0;
    }
}