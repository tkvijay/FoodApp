package com.foodApp.foodAppApi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.foodApp.foodAppApi.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category save(Category category);
    Optional<Category> findById(Long id);
    void delete(Category category);
    @Query("SELECT c FROM categories p ORDER BY c.name DESC")
    List<Category> findTop3ByName();
} 
