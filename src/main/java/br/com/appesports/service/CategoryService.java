package br.com.appesports.service;

import br.com.appesports.controller.category.CategoriesDTO;

public interface CategoryService {

    CategoriesDTO getCategories();

    void saveNewCategory(String categoryName);

}
