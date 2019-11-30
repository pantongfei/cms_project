package com.briup.cms_project.web.Controller;

import com.briup.cms_project.bean.Article;
import com.briup.cms_project.service.IArticleService;
import com.briup.cms_project.untils.Message;
import com.briup.cms_project.untils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "文章信息管理")
@RequestMapping("/Article")
public class ArticleController {
    @Autowired
    private IArticleService iArticleService;

    @GetMapping("/add")
    @ApiOperation(value = "添加文章", notes = "category_code和category_name不需要写")
    public Message addArticle(Article article) {
        iArticleService.addArticle(article);
        return MessageUtil.success();
    }

    @GetMapping("/queryArticleById")
    @ApiOperation("根据Id查询文章")
    public Message<Article> queryArticleById(int id) {
        Article article = iArticleService.queryArticleById(id);
        return MessageUtil.success(article);
    }

    @GetMapping("delete")
    @ApiOperation("根据id删除文章信息")
    public Message deleteArticleById(int id) {
        iArticleService.deleteArticle(id);
        return MessageUtil.success();
    }
}
