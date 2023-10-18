package br.com.appesports.service;

import br.com.appesports.controller.category.Categories;
import br.com.appesports.model.news.Category;

import java.util.List;

public interface CategoryService {

    Categories getCategories();

    void saveNewCategory(Category category);

}
