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

    /**
     * 查询所有文章内容 根据时间排序
     * @return 所有文章
     */
    @GetMapping("findAll")
    public List<Article> findAll(){
        return articleService.findAll();
    }

    @RequestMapping("selectByArtId")
    public Article selectByArtId(Integer artId) {
        return articleService.selectByArtId(artId);
    }

    @GetMapping()
    public List<Article> selectArticleByUid(Integer uid){
        return articleService.selectArticleByUid(uid);
    }
}