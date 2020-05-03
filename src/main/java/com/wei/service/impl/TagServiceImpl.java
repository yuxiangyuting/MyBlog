package com.wei.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wei.dao.TagDao;
import com.wei.entity.Tag;
import com.wei.service.TagService;
import org.springframework.stereotype.Service;

/**
 * 技术栈标签(Tag)表服务实现类
 *
 * @author makejava
 * @since 2020-05-03 19:56:41
 */
@Service("tagService")
public class TagServiceImpl extends ServiceImpl<TagDao, Tag> implements TagService {

    @Override
    public boolean insert(Tag tag) {
        return getBaseMapper().insert(tag)>0;
    }
}