package com.briup.cms_project.dao;

import com.briup.cms_project.bean.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticle extends JpaRepository<Article,Integer> {
}
