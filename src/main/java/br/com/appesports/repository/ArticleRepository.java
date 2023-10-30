package br.com.appesports.repository;

import br.com.appesports.model.news.Article;
import br.com.appesports.model.news.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    Article findArticleByCategory(Category category);

    List<Article> findAllByCategories(List<Category> categories);

}
