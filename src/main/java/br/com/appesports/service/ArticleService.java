package br.com.appesports.service;

import br.com.appesports.model.news.Article;

import java.util.Date;
import java.util.List;

public interface ArticleService {

  public void createArticle(Article article);

  public void saveAsDraft(Article article);

  public void publishArticle(Article article);

  public void editArticle(Article article);

  public Article findArticleByDate(Date date);

  public void deleteArticle(Article article);

  public List<Article> listAllArticles();
}
