package br.com.appesports.controller;

import br.com.appesports.model.news.Article;
import br.com.appesports.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class ArticleController {

    @Autowired
    public ArticleService articleService;

    @PostMapping
    public void saveArticle(Article article) {
        articleService.publishArticle(article);
    }

}
