package com.empleados_web.empleados_web.services;

import com.empleados_web.empleados_web.interfaces.CategoryInterface;
import com.empleados_web.empleados_web.model.Category;
import com.empleados_web.empleados_web.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements CategoryInterface {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategory(Long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Boolean deleteCategory(Long id) {
        categoryRepository.deleteById(id);
        return true;
    }
}
