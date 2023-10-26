package br.com.appesports.service.impl;

import br.com.appesports.controller.category.CategoriesDTO;
import br.com.appesports.model.news.Category;
import br.com.appesports.repository.CategoryRepository;
import br.com.appesports.service.CategoryService;
import br.com.appesports.service.handle.CategoryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Override
    public CategoriesDTO getCategories() {
        return getCategoriesName(repository.findAll());
    }

    @Override
    public void saveNewCategory(String categoryName) {
        if (Objects.nonNull(repository.findByCategoryName(categoryName))) {
            throw new CategoryException("Esta categoria já está cadastrada!");
        }

        repository.save(new Category(categoryName));
    }

    private CategoriesDTO getCategoriesName(List<Category> categoryList) {
        return new CategoriesDTO(categoryList.stream().map(Category::getCategoryName).collect(Collectors.toList()));
    }
}
