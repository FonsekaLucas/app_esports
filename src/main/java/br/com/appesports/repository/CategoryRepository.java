package br.com.appesports.repository;

import br.com.appesports.model.news.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
