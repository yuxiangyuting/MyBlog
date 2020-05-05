package com.wei.controller;


import com.baomidou.mybatisplus.extension.api.ApiController;
import com.wei.entity.Article;
import com.wei.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Essay)表控制层
 *
 * @author makejava
 * @since 2020-05-02 12:46:41
 */
@CrossOrigin
@RestController
@RequestMapping("article")
public class ArticleController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ArticleService articleService;

    @RequestMapping("selectByArtId")
    public Article selectByArtId(Integer artId) {
        return articleService.selectByArtId(artId);
    }

    @GetMapping("selectTopArticleByUid")
    public List<Article> selectTopArticleByUid(Integer uid) {
        return articleService.selectTopArticleByUid(uid);
    }

    @GetMapping("selectNoTopArticleByUid")
    public List<Article> selectNoTopArticleByUid(Integer uid) {
        return articleService.selectNoTopArticleByUid(uid);
    }

    @GetMapping("findAllTopArticle")
    public List<Article> findAllTopArticle() {
        return articleService.findAllTopArticle();
    }

    @GetMapping("selectNoTopArticle")
    public List<Article> findAllNoTopArticle() {
        return articleService.findAllNoTopArticle();
    }
}