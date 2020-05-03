package com.wei.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (Essay)表实体类
 *
 * @author makejava
 * @since 2020-05-02 12:46:41
 */
@SuppressWarnings("serial")
public class Essay extends Model<Essay> {
    //文章id
    private Integer eid;
    //标题
    private String title;
    //用户id
    private Integer uid;
    //发布时间
    private Date issuedate;
    //浏览量
    private Integer pageview;
    //评论id
    private Integer rid;
    //内容
    private String content;
    //图片
    private String image;


    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    public Integer getPageview() {
        return pageview;
    }

    public void setPageview(Integer pageview) {
        this.pageview = pageview;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.eid;
    }
    }