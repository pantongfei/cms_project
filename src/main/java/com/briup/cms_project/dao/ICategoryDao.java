package com.briup.cms_project.dao;

import com.briup.cms_project.bean.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICategoryDao extends JpaRepository<Category, Integer> {
    Category findById(int id);

    @Query(value = "select * from cms_category c,cms_article a where c.id=a.category_id", nativeQuery = true)
    List<Category> queryAllCategory();

    @Query(value = "select * from cms_category c,cms_article a where c.id=a.category_id and c.id=?1", nativeQuery = true)
    Category findCaseById(int id);
}
