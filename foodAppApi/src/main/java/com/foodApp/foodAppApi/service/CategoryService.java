package com.foodApp.foodAppApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodApp.foodAppApi.model.Category;
import com.foodApp.foodAppApi.repository.CategoryRepository;

@Service
public class CategoryService {
   
    @Autowired
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getCategories(){
        return categoryRepository.findAll();
    }

    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }

    public Category updateCategory(Long id, Category categoryDetails){
        return categoryRepository.findById(id)
            .map(category -> {
                category.setName(categoryDetails.getName());
                return categoryRepository.save(category);
            })
            .orElseThrow(() -> new RuntimeException("Category not found with id " + id));
    }

    public Optional<Category> getCategoryById(Long id) {
        return Optional.ofNullable(categoryRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Category not found with id " + id)));
    }

    public void deleteCategory(Long id){
        categoryRepository.findById(id)
            .map(category -> {
                categoryRepository.delete(category);
                return category;
            })
            .orElseThrow(() -> new RuntimeException("Category not found with id " + id));
    }

    public List<Category> findTopThree(){
        return categoryRepository.findTop3ByName();
    }

}
