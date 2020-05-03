package com.wei.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wei.entity.Tag;
import com.wei.entity.Usertag;
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
    @Select("select * from userTag u,tag t where t.tagId=u.tagId and uid=#{uid}")
    List<Tag> selectTagsByUid(Integer uid);

}