package br.com.appesports.controller;

import br.com.appesports.model.news.Article;
import br.com.appesports.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.constraints.NotNull;

public class ArticleController {

    @Autowired
    public ArticleService articleService;

    @GetMapping
    @ResponseBody()
    public void saveArticle(@NotNull Article article) {
        articleService.publishArticle(article);
    }

}
