package com.wei.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wei.entity.Tag;
import com.wei.entity.Usertag;
import com.wei.entity.vo.UsertagVo;

import java.util.List;

/**
 * 用户已选择的标签(Usertag)表服务接口
 *
 * @author makejava
 * @since 2020-05-03 21:36:39
 */
public interface UsertagService extends IService<Usertag> {

    /**
     * 通过uid查找属于改作者的标签
     *
     * @param uid 作者id
     * @return 标签集合
     */
    List<UsertagVo> selectTagByUid(long uid);
}