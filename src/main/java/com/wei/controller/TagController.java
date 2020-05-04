package com.wei.controller;

import com.baomidou.mybatisplus.extension.api.ApiController;
import com.wei.entity.Tag;
import com.wei.service.TagService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 技术栈标签(Tag)表控制层
 *
 * @author makejava
 * @since 2020-05-03 19:56:41
 */

@CrossOrigin
@RestController
@RequestMapping("tag")
public class TagController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TagService tagService;

    @RequestMapping("findAll")
    public List<Tag> findAll() {
        return tagService.getBaseMapper().selectList(null);
    }

    @RequestMapping("insert")
    public boolean insert(Tag tag) {
        return tagService.insert(tag);
    }
}