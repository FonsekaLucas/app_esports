package br.com.appesports.controller;

import br.com.appesports.model.news.Article;
import br.com.appesports.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.constraints.NotNull;
@RequiredArgsConstructor
public class ArticleController {

    public ArticleService articleService;

    @PostMapping
    @ResponseBody()
    public void saveArticle(@NotNull Article article) {
        articleService.publishArticle(article);
    }

}
