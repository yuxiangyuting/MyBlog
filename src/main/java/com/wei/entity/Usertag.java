package com.wei.entity;

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
public class Usertag extends Model<Usertag> {
    /**
    *id
    */
    private Integer utid;
    /**
    *用户id
    */
    private Integer uid;
    /**
    *标签id
    */
    private Integer tagid;


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