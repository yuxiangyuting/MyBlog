package com.wei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wei.dao.UsertagDao;
import com.wei.entity.Usertag;
import com.wei.entity.vo.UsertagVo;
import com.wei.service.UsertagService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户已选择的标签(Usertag)表服务实现类
 *
 * @author makejava
 * @since 2020-05-03 21:36:39
 */
@Service("usertagService")
public class UsertagServiceImpl extends ServiceImpl<UsertagDao, Usertag> implements UsertagService {

    @Override
    public List<UsertagVo> selectTagByUid(Integer uid) {
        return getBaseMapper().selectTagsByUid(uid);
    }
}