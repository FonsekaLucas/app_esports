package br.com.appesports.service;

import br.com.appesports.model.news.Category;

import java.util.List;

public interface CategoryService {

    public List<Category> getCategories();

    public void saveNewCategories(List<Category> category);

}
