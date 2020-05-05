package com.wei.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wei.entity.Reply;
import com.wei.service.ReplyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 评论系统(Reply)表控制层
 *
 * @author makejava
 * @since 2020-05-05 12:13:18
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

    @RequestMapping("commentSystem")
    public List<Reply> commentSystem(long artId) {
        return this.replyService.commentSystem(artId);
    }
}