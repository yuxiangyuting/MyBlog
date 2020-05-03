package com.wei.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wei.entity.Topic;
import com.wei.service.TopicService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 评论(Topic)表控制层
 *
 * @author makejava
 * @since 2020-05-03 19:56:41
 */
@RestController
@RequestMapping("topic")
public class TopicController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TopicService topicService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param topic 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Topic> page, Topic topic) {
        return success(this.topicService.page(page, new QueryWrapper<>(topic)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.topicService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param topic 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Topic topic) {
        return success(this.topicService.save(topic));
    }

    /**
     * 修改数据
     *
     * @param topic 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Topic topic) {
        return success(this.topicService.updateById(topic));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.topicService.removeByIds(idList));
    }
}