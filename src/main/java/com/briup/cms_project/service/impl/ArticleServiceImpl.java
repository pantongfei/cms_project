package com.briup.cms_project.service.impl;

import com.briup.cms_project.bean.Article;
import com.briup.cms_project.dao.IArticleDao;
import com.briup.cms_project.exception.CustomerException;
import com.briup.cms_project.service.IArticleService;
import com.briup.cms_project.untils.CodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ArticleServiceImpl implements IArticleService {
    @Autowired
    private IArticleDao iArticleDao;

    @Override
    public void addArticle(Article article) throws CustomerException {
        if (article == null) {
            throw new CustomerException(CodeUtils.BAD_CODE, "参数为空");
        } else {
            Article dataArticle = iArticleDao.findById(article.getId());
            if (dataArticle == null) {
                article.setClickTimes(0);
                article.setPublishDate(new Date());
                iArticleDao.save(article);
            } else {
                throw new CustomerException(CodeUtils.EXIT, "文章已经存在");
            }
        }
    }

    @Override
    public void updateArticle(Article article) throws CustomerException {

    }

    @Override
    public void deleteArticle(int id) throws CustomerException {
        iArticleDao.deleteById(id);
    }

    @Override
    public Article queryArticleById(int id) throws CustomerException {
        Article article = iArticleDao.findById(id);
        return article;
    }

    @Override
    public List<Article> queryAllArticle() throws CustomerException {
        return null;
    }
}
