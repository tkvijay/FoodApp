package com.foodApp.foodAppApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodApp.foodAppApi.model.Product;
import com.foodApp.foodAppApi.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }
    
    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product productDetails){
        return productRepository.findById(id)
            .map(product -> {
                product.setName(productDetails.getName());
                product.setPrice(productDetails.getPrice());
                return productRepository.save(product);
            })
            .orElseThrow(() -> new RuntimeException("Product not found with id " + id));
    }

    public Optional<Product> deleteProduct(Long id){
        return productRepository.findById(id)
            .map(product -> {
                productRepository.delete(product);
                return product;
            });
    }

    public  List<Product> findTopThree(){
        return productRepository.findTop3ByName();
    }

    // public List<Product> findByCategoryId(Long categoryId){
    //     return productRepository.findByCategoryId(categoryId);
    // }

}
