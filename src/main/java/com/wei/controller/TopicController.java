package com.wei.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wei.entity.Topic;
import com.wei.service.TopicService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 评论(Topic)表控制层
 *
 * @author makejava
 * @since 2020-05-03 19:56:41
 */
@CrossOrigin
@RestController
@RequestMapping("topic")
public class TopicController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TopicService topicService;

}