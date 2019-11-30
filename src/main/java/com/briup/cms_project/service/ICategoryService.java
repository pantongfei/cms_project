package com.briup.cms_project.service;

import com.briup.cms_project.bean.Category;
import com.briup.cms_project.bean.ex.CategoryEX;
import com.briup.cms_project.exception.CustomerException;

import java.util.List;

public interface ICategoryService {
    //添加栏目
    public void addCategory(Category category) throws CustomerException;

    //修改栏目
    public void updateCategory(Category category) throws CustomerException;

    //删除栏目
    public void deleteCategory(int id) throws CustomerException;

    //根据id查询栏目
    public Category queryCategoryById(int id) throws CustomerException;

    //查询全部栏目
    public List<Category> queryAllCategory() throws CustomerException;

    //查询所有栏目包括栏目所对应的信息
    public List<CategoryEX> findAllCategoryEx() throws  CustomerException;
}
