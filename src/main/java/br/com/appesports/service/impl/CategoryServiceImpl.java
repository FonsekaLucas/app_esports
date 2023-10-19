package br.com.appesports.service.impl;

import br.com.appesports.controller.category.Categories;
import br.com.appesports.model.news.Category;
import br.com.appesports.repository.CategoryRepository;
import br.com.appesports.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Override
    public Categories getCategories() {
        return getCategoriesName(repository.findAll());
    }

    @Override
    public void saveNewCategory(Category category) {

    }

    private Categories getCategoriesName(List<Category> categoryList) {
        return new Categories(categoryList.stream().map(Category::getCategoryName).collect(Collectors.toList()));
    }
}
