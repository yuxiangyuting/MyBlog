package com.wei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wei.dao.ReplyDao;
import com.wei.entity.Reply;
import com.wei.service.ReplyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 评论系统(Reply)表服务实现类
 *
 * @author makejava
 * @since 2020-05-05 12:13:18
 */
@Service("replyService")
public class ReplyServiceImpl extends ServiceImpl<ReplyDao, Reply> implements ReplyService {

    @Override
    public List<Reply> commentSystem(long artId,Integer page) {
        //获取所有评论包括父级子级评论
        List<Reply> all = getBaseMapper().replyList(artId,page);
        List<Reply> result = new ArrayList<>();
        //第一次遍历将父级评论取出放到一个新的list集合里，同时将评论唯一标识tid当做key放入一个map里，值是当前遍历的评论对象
        for (Reply c : all) {
            //如果父级id为空，则表示这是一个父级评论
            if (c.getParentId() == null) {
                result.add(c);
            }
        }

        //第二次遍历，将子级评论取出
        for (Reply reply : result) {
            //新建用来存放子级评论的集合
            List<Reply> list = new ArrayList<>();
            for (Reply c : all) {
                //如果子级的所属一级评论id等于一级评论id
                if (c.getReplyId() == reply.getTid()) {
                    //就把子级评论装进list列表中
                    list.add(c);
                }
            }
            //最后将装完该子级集合的list赋值给当前遍历的父级评论对象的child集合
            reply.setChild(list);
        }
        //返回组织好的树形数据集合对象
        return result;
    }
}