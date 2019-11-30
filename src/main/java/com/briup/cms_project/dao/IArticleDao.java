package com.briup.cms_project.dao;

import com.briup.cms_project.bean.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IArticleDao extends JpaRepository<Article, Integer> {
    Article findById(int id);

    @Query(value = "select * from cms_article a where a.category_id=?1", nativeQuery = true)
        //@Query(value="select * from t_student where department_id=?1",nativeQuery=true)
    List<Article> getArticleByCategory_id(int id);
}
