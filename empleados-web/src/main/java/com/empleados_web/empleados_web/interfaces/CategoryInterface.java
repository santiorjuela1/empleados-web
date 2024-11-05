package com.empleados_web.empleados_web.interfaces;

import com.empleados_web.empleados_web.model.Category;

import java.util.List;
import java.util.Locale;

public interface CategoryInterface {
    public List<Category> getCategories();
    public Category getCategory(Long id);
    public Category createCategory(Category category);
    public Category updateCategory(Category category);
    public Boolean deleteCategory(Long id);
}
