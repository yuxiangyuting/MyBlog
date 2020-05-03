package com.wei.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 技术栈标签(Tag)表实体类
 *
 * @author makejava
 * @since 2020-05-03 19:56:41
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class Tag extends Model<Tag> {
    /**
    *标签id
    */
    private Integer tagid;
    /**
    *标签名
    */
    private String tagname;


    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.tagid;
    }
    }