package com.foodApp.foodAppApi.repository;
import com.foodApp.foodAppApi.model.Product;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product save(Product product);

    Optional<Product> findById(Long id);

    void delete(Product product);
    
}