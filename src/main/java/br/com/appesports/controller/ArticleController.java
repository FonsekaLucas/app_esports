package br.com.appesports.controller;

import br.com.appesports.model.news.Article;
import br.com.appesports.service.ArticleService;
import org.springframework.web.bind.annotation.PostMapping;
public class ArticleController {

    public ArticleService articleService;

    @PostMapping
    public void saveArticle(Article article) {
        articleService.publishArticle(article);
    }

}
