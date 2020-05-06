package com.wei.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wei.entity.Tag;
import com.wei.entity.Usertag;
import com.wei.entity.vo.UsertagVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户已选择的标签(Usertag)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-03 21:36:39
 */
public interface UsertagDao extends BaseMapper<Usertag> {

    /**
     * 通过uid查找属于改作者的标签
     *
     * @param uid 作者id
     * @return 标签集合
     */
    @Select("select u.uTid,u.uid,t.tagId,t.tagName,count(a.tagId) count from userTag u join tag t on t.tagId=u.tagId join article a on a.tagId=u.tagId where u.uid=#{uid} group by u.tagId")
    List<UsertagVo> selectTagsByUid(long uid);

}