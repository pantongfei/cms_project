package com.briup.cms_project.service.impl;

import com.briup.cms_project.bean.Category;
import com.briup.cms_project.bean.ex.CategoryEX;
import com.briup.cms_project.dao.ICategoryDao;
import com.briup.cms_project.dao.ex.ICategoryEXDao;
import com.briup.cms_project.exception.CustomerException;
import com.briup.cms_project.service.ICategoryService;
import com.briup.cms_project.untils.CodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryDao iCategoryDao;
    @Autowired
    private ICategoryEXDao iCategoryEXDao;
    @Override
    public void addCategory(Category category) throws CustomerException {
        if (category == null) {
            throw new CustomerException(CodeUtils.BAD_CODE, "参数为空");
        } else {
            Category dataCategory = iCategoryDao.findById(category.getId());
            if (dataCategory == null) {
                iCategoryDao.save(category);
            } else {
                throw new CustomerException(CodeUtils.EXIT, "栏目已存在");
            }
        }
    }

    @Override
    public void updateCategory(Category category) throws CustomerException {
        if (category == null) {
            throw new CustomerException(CodeUtils.BAD_CODE, "参数为空");
        } else {
            Category category1 = iCategoryDao.findById(category.getId());
            category1.setCode(category.getCode());
            category1.setName(category.getName());
            iCategoryDao.save(category1);
        }
    }

    @Override
    public void deleteCategory(int id) throws CustomerException {
        iCategoryDao.deleteById(id);
    }

    @Override
    public Category queryCategoryById(int id) throws CustomerException {
        Category data1Category = iCategoryDao.findById(id);
        return data1Category;
    }

    @Override
    public List<Category> queryAllCategory() throws CustomerException {
        List<Category> allCategory = iCategoryDao.queryAllCategory();
        return allCategory;
    }

    @Override
    public List<CategoryEX> findAllCategoryEx() throws CustomerException {
        return iCategoryEXDao.findAll();
    }

}
