package com.wei.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wei.entity.Reply;

import java.util.List;

/**
 * 评论系统(Reply)表服务接口
 *
 * @author makejava
 * @since 2020-05-05 12:13:18
 */
public interface ReplyService extends IService<Reply> {

    /**
     * 显示评论及评论下的回复功能
     * @param artId 文章id
     * @return 评论和回复列表
     */
    List<Reply> commentSystem(long artId,Integer page);
}