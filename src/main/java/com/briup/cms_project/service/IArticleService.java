package com.briup.cms_project.service;

import com.briup.cms_project.bean.Article;
import com.briup.cms_project.exception.CustomerException;

import java.util.List;

public interface IArticleService {
    //填加文章
    public void addArticle(Article article) throws CustomerException;

    //修改文章
    public void updateArticle(Article article) throws CustomerException;

    //删除文章
    public void deleteArticle(int id) throws CustomerException;

    //根据id查询文章
    public Article queryArticleById(int id) throws CustomerException;

    //查询所有文章
    public List<Article> queryAllArticle() throws CustomerException;

}
