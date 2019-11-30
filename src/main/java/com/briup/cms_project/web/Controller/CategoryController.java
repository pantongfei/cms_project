package com.briup.cms_project.web.Controller;

import com.briup.cms_project.bean.Category;
import com.briup.cms_project.service.ICategoryService;
import com.briup.cms_project.untils.Message;
import com.briup.cms_project.untils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(description = "栏目管理模块")
@RequestMapping("/Category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/add")
    @ApiOperation("添加栏目")
    public Message addCategory(Category category) {
        categoryService.addCategory(category);
        return MessageUtil.success();
    }

    @GetMapping("/update")
    @ApiOperation("修改栏目")
    public Message updateCategory(Category category) {
        categoryService.updateCategory(category);
        return MessageUtil.success();
    }

    @GetMapping("delete")
    @ApiOperation("删除栏目")
    public Message deleteCategory(int id) {
        categoryService.deleteCategory(id);
        return MessageUtil.success();
    }

    @GetMapping("/queryCategoryById")
    @ApiOperation("根据id查询栏目")
    public Message<Category> queryCategoryById(int id) {
        Category category = categoryService.queryCategoryById(id);
        return MessageUtil.success(category);
    }

    @GetMapping("/queryAllCategory")
    @ApiOperation("查询全部的栏目")
    public Message<List<Category>> queryAllCategory() {
        List<Category> categories = categoryService.queryAllCategory();
        return MessageUtil.success(categories);
    }
}
