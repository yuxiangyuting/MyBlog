package com.wei.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wei.entity.Reply;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 评论系统(Reply)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-05 12:13:18
 */
public interface ReplyDao extends BaseMapper<Reply> {
    /**
     * 查找指定评论下的所有回复
     *
     * @param artId 文章id
     * @return 回复列表
     */
    @Select("select t.tid,u.nickname,t.content,t.tiDate,t.`like`,t.artId from reply t join user u on t.uid = u.uid where artId=#{artId} and replyId=#{replyId}")
    List<Reply> replyList(@Param("artId") long artId, @Param("replyId") long replyId);

    /**
     * 查找指定评论下的所有评论，不包含回复
     *
     * @param artId 文章id
     * @return 回复列表
     */
    @Select("select t.tid,u.nickname,t.content,t.tiDate,t.`like`,t.artId from reply t join user u on t.uid = u.uid where artId=#{artId} and replyId IS NULL")
    List<Reply> noReplyList(long artId);
}