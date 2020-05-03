package com.wei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wei.dao.ReplyDao;
import com.wei.entity.Reply;
import com.wei.service.ReplyService;
import org.springframework.stereotype.Service;

/**
 * 评论回复(Reply)表服务实现类
 *
 * @author makejava
 * @since 2020-05-03 19:56:41
 */
@Service("replyService")
public class ReplyServiceImpl extends ServiceImpl<ReplyDao, Reply> implements ReplyService {

}