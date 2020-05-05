package com.wei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wei.dao.ReplyDao;
import com.wei.entity.Reply;
import com.wei.service.ReplyService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 评论系统(Reply)表服务实现类
 *
 * @author makejava
 * @since 2020-05-05 12:13:18
 */
@Service("replyService")
public class ReplyServiceImpl extends ServiceImpl<ReplyDao, Reply> implements ReplyService {

    @Override
    public List<Reply> commentSystem(long artId) {
        List<Reply> noReplyList = getBaseMapper().noReplyList(artId);
        for (Reply noReply : noReplyList) {
            noReply.setList(getBaseMapper().replyList(artId,noReply.getTid()));
        }
        return noReplyList;
    }
}