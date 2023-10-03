package br.com.appesports.service.impl;

import br.com.appesports.model.news.Category;
import br.com.appesports.repository.CategoryRepository;
import br.com.appesports.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository repository;
    @Override
    public List<Category> getCategories() {
        return null;
    }

    @Override
    public void saveNewCategories(List<Category> category) {

    }
}
