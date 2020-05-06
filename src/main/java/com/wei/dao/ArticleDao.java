package com.wei.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wei.entity.Article;
import com.wei.entity.vo.ArticleVo;
import org.apache.ibatis.annotations.Select;

/**
 * (Essay)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-02 12:46:41
 */
public interface ArticleDao extends BaseMapper<Article> {

    /**
     * 通过文章id查找文章
     *
     * @param artId 文章id
     * @return 文章信息对象
     */
    @Select("select a.artid,\n" +
            "       u.nickname,\n" +
            "       a.image,\n" +
            "       a.title,\n" +
            "       a.content,\n" +
            "       a.pushDate,\n" +
            "       a.pageView,\n" +
            "       count(ti.tid) tiCount,\n" +
            "       t.tagName\n" +
            "from article a\n" +
            "         join user u on a.uid = u.uid\n" +
            "         join tag t on t.tagId = a.tagId\n" +
            "         join reply ti on a.artId = ti.artId\n" +
            "where a.artId = #{artId};")
    ArticleVo selectByArtId(long artId);
}