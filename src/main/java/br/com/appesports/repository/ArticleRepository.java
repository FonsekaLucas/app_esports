package br.com.appesports.repository;

import br.com.appesports.model.Article;
import br.com.appesports.model.enums.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    public Article findArticleByCategory(Category category);

    public List<Article> findAllByCategories(List<Category> categories);

}
