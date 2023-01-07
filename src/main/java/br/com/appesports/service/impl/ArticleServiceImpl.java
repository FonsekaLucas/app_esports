package br.com.appesports.service.impl;

import br.com.appesports.model.news.Article;
import br.com.appesports.repository.ArticleRepository;
import br.com.appesports.service.ArticleService;
import br.com.appesports.service.handle.InvalidArticleException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ArticleServiceImpl implements ArticleService {

  @Autowired
  private ArticleRepository articleRepository;

  @Override
  public void createArticle(Article article) {

  }

  @Override
  public void saveAsDraft(Article article) {

  }

  @Override
  public void publishArticle(Article article) {
    try {
      articleRepository.save(article);
    } catch (Exception e) {
      throw new InvalidArticleException();
    }
  }

  @Override
  public void editArticle(Article article) {
  }

  @Override
  public Article findArticleByDate(Date date) {
    return null;
  }

  @Override
  public void deleteArticle(Article article) {

  }

  @Override
  public List<Article> listAllArticles() {
    return null;
  }

}
