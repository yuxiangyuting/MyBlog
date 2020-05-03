package com.wei.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wei.entity.Usertag;
import com.wei.service.UsertagService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 用户已选择的标签(Usertag)表控制层
 *
 * @author makejava
 * @since 2020-05-03 19:56:41
 */
@RestController
@RequestMapping("usertag")
public class UsertagController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UsertagService usertagService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param usertag 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Usertag> page, Usertag usertag) {
        return success(this.usertagService.page(page, new QueryWrapper<>(usertag)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.usertagService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param usertag 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Usertag usertag) {
        return success(this.usertagService.save(usertag));
    }

    /**
     * 修改数据
     *
     * @param usertag 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Usertag usertag) {
        return success(this.usertagService.updateById(usertag));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.usertagService.removeByIds(idList));
    }
}