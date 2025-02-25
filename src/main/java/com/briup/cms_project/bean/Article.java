package com.briup.cms_project.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "cms_article")
@ApiModel
public class Article implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "文章的id")
    private Integer id;
    @ApiModelProperty("文章的作者")
    private String author;
    @ApiModelProperty(value = "文章的点击次数", hidden = true)
    private int clickTimes;
    @ApiModelProperty("文章的描述")
    @NotEmpty(message = "内容不能为空")
    private String content;
    @ApiModelProperty(value = "文章的发布时间", hidden = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    //@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    //@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss”,timezone = “GMT+8")
    private Date publishDate;
    @ApiModelProperty("文章的标题")
    private String title;
    @ApiModelProperty("文章的栏目")
    @ManyToOne//cascade={CascadeType.MERGE,CascadeType.REFRESH},
    @JoinColumn(name = "category_id")//设置在Category表中的关联字段(外键)
    @JsonIgnore
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getClickTimes() {
        return clickTimes;
    }

    public void setClickTimes(int clickTimes) {
        this.clickTimes = clickTimes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    /*public void setPublishDate(Timestamp publishDate) {
        this.publishDate = publishDate;
    }*/

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Article() {
    }
}
