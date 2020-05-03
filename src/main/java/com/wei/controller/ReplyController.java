package com.wei.controller;

import com.baomidou.mybatisplus.extension.api.ApiController;
import com.wei.service.ReplyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 评论回复(Reply)表控制层
 *
 * @author makejava
 * @since 2020-05-03 19:56:41
 */
@CrossOrigin
@RestController
@RequestMapping("reply")
public class ReplyController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ReplyService replyService;


}