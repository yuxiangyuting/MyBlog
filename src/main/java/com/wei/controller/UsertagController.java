package com.wei.controller;

import com.baomidou.mybatisplus.extension.api.ApiController;
import com.wei.entity.Tag;
import com.wei.entity.User;
import com.wei.entity.vo.UsertagVo;
import com.wei.service.UsertagService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户已选择的标签(Usertag)表控制层
 *
 * @author makejava
 * @since 2020-05-03 21:36:39
 */
@CrossOrigin
@RestController
@RequestMapping("usertag")
public class UsertagController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UsertagService usertagService;


    @RequestMapping("selectTagByUid")
    public List<UsertagVo> selectTagByUid(Integer uid) {
        return usertagService.selectTagByUid(uid);
    }
}