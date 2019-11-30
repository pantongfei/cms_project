package com.briup.cms_project.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "cms_article")
@ApiModel
public class ArticleCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("文章的id")
    private int id;
    @ApiModelProperty("文章的作者")
    private String author;
    @ApiModelProperty(value = "文章的点击次数")
    private int clickTimes;
    @ApiModelProperty("文章的描述")
    @NotEmpty(message = "内容不能为空")
    private String content;
    @ApiModelProperty(value = "文章的发布时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date publishDate;
    @ApiModelProperty("文章的标题")
    private String title;

    @ApiModelProperty("文章的栏目")


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

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
