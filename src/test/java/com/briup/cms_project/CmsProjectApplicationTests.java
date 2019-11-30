package com.briup.cms_project;

import com.briup.cms_project.bean.Article;
import com.briup.cms_project.bean.Category;
import com.briup.cms_project.service.IArticleService;
import com.briup.cms_project.service.ICategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CmsProjectApplicationTests {
    @Autowired
    private IArticleService articleService;
    @Autowired
    private ICategoryService categoryService;

    @Test
    public void contextLoads() {
        Article article = articleService.queryArticleById(3);
        long code = article.getCategory().getCode();
        String name = article.getCategory().getName();
        System.out.println("code:" + code + "name" + name);
    }

    @Test
    public void CategoryTest() {
        Category category = categoryService.queryCategoryById(5);


    }

}
