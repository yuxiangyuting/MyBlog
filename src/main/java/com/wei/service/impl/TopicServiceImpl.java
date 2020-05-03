package com.wei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wei.dao.TopicDao;
import com.wei.entity.Topic;
import com.wei.service.TopicService;
import org.springframework.stereotype.Service;

/**
 * 评论(Topic)表服务实现类
 *
 * @author makejava
 * @since 2020-05-03 19:56:41
 */
@Service("topicService")
public class TopicServiceImpl extends ServiceImpl<TopicDao, Topic> implements TopicService {

}