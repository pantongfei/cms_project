package com.briup.cms_project.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@ApiModel
@Table(name = "cms_category")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "栏目id")
    private Integer id;
    @ApiModelProperty("栏目编号")
    private long code;
    @ApiModelProperty("栏目名字")
    private String name;
    //mappedBy = "category"表示关系是被维护端
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Article> articlesList;
    /*@OneToMany(targetEntity = Article.class)
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    private  ArticleCase articleCase;*/

  /*  public Category(long code, String name, List<Article> articlesList) {
        this.code = code;
        this.name = name;
        this.articlesList = articlesList;
    }*/

    public List<Article> getArticlesList() {
        return articlesList;
    }

    public void setArticlesList(List<Article> articlesList) {
        this.articlesList = articlesList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public List<Article> getArticlesList() {
        return articlesList;
    }

    public void setArticlesList(List<Article> articlesList) {
        this.articlesList = articlesList;
    }*/
    public Category() {
    }

}
