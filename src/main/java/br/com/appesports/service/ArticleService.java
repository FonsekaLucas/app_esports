package br.com.appesports.service;

import br.com.appesports.model.Article;

import java.util.Date;

public interface ArticleService {

    public String publishArticle(Article article);

    public String editArticle(Article article);

    public Article findArticleByDate(Date date);

    public void deleteArticle(Article article);
}
