package com.wei.entity.vo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户已选择的标签(Usertag)表实体类
 *
 * @author makejava
 * @since 2020-05-03 21:36:39
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class UsertagVo extends Model<UsertagVo> {
    /**
     * id
     */
    private long utid;

    /**
     * 标签id
     */
    private long tagid;
    /**
     * 用户id
     */
    private long uid;

    /**
     * 标签名
     */
    private String tagname;

    /**
     * 每个标签下的文章数量
     */
    private long count;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.utid;
    }
}