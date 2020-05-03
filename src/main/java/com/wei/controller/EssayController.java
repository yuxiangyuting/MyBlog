package com.wei.controller;


import com.baomidou.mybatisplus.extension.api.ApiController;
import com.wei.entity.Article;
import com.wei.service.EssayService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Essay)表控制层
 *
 * @author makejava
 * @since 2020-05-02 12:46:41
 */
@RestController
@RequestMapping("essay")
public class EssayController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private EssayService essayService;

    /**
     * 查询所有文章内容 根据时间排序
     * @return 所有文章
     */
    @GetMapping
    public List<Article> findAll(){
        return essayService.findAll();
    }
}