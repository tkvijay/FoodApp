package com.foodApp.foodAppApi.repository;
import com.foodApp.foodAppApi.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product save(Product product);

    Optional<Product> findById(Long id);

    void delete(Product product);
    
    @Query("SELECT p FROM Product p ORDER BY p.name DESC")
    List<Product> findTop3ByName();

    // @Query("SELECT p FROM Product p where p.categoryid = :categoryID ORDER BY name DESC")
    // List<Product> findByCategoryId(@Param("categoryID") Long categoryId);
    
}