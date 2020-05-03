package com.wei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wei.dao.UsertagDao;
import com.wei.entity.Usertag;
import com.wei.service.UsertagService;
import org.springframework.stereotype.Service;

/**
 * 用户已选择的标签(Usertag)表服务实现类
 *
 * @author makejava
 * @since 2020-05-03 19:56:41
 */
@Service("usertagService")
public class UsertagServiceImpl extends ServiceImpl<UsertagDao, Usertag> implements UsertagService {

}