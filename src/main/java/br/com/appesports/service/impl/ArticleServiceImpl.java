package br.com.appesports.service.impl;

import br.com.appesports.model.Article;
import br.com.appesports.repository.ArticleRepository;
import br.com.appesports.service.ArticleService;
import br.com.appesports.service.handle.InvalidArticleException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public String publishArticle(Article article) {
        try {
            articleRepository.save(article);
        } catch (Exception e) {
            throw new InvalidArticleException();
        }
        return "Publicação foi salva";
    }

    @Override
    public String editArticle(Article article) {
        return null;
    }

    @Override
    public Article findArticleByDate(Date date) {
        return null;
    }

    @Override
    public void deleteArticle(Article article) {

    }

}
