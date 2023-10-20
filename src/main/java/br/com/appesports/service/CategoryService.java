package br.com.appesports.service;

import br.com.appesports.controller.category.Categories;

public interface CategoryService {

    Categories getCategories();

    void saveNewCategory(String categoryName);

}
