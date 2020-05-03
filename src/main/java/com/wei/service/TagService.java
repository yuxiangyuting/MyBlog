package com.wei.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wei.entity.Tag;

/**
 * 技术栈标签(Tag)表服务接口
 *
 * @author makejava
 * @since 2020-05-03 19:56:41
 */
public interface TagService extends IService<Tag> {

    /**
     * 通过id查找标签
     * @param tag 标签信息
     * @return 布尔
     */
    boolean insert(Tag tag);
}