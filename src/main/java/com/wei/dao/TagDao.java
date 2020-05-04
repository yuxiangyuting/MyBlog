package com.wei.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wei.entity.Tag;
import org.apache.ibatis.annotations.Select;

/**
 * 技术栈标签(Tag)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-03 19:56:41
 */
public interface TagDao extends BaseMapper<Tag> {

}