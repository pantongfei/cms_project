package com.briup.cms_project.dao;

import com.briup.cms_project.bean.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategory extends JpaRepository<Category,Integer>  {
}
