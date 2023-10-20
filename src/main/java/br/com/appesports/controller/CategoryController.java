package br.com.appesports.controller;

import br.com.appesports.controller.category.Categories;
import br.com.appesports.model.news.Category;
import br.com.appesports.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value =  "/getCategories", produces = MediaType.APPLICATION_JSON_VALUE)
    private Categories getCategories() {
        return categoryService.getCategories();
    }

    @PutMapping("/saveNewCategory")
    private void saveNewCategory(String categoryName) {
        categoryService.saveNewCategory(categoryName);
    }

}
