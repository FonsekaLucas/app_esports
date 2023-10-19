package br.com.appesports.controller;

import br.com.appesports.model.news.Article;
import br.com.appesports.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.constraints.NotNull;
public class ArticleController {

    public ArticleService articleService;

    @PostMapping
    public void saveArticle(Article article) {
        articleService.publishArticle(article);
    }

}
