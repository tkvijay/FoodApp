package com.foodApp.foodAppApi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.foodApp.foodAppApi.model.BookTable;

@Repository
public interface BookTableRepository extends JpaRepository<BookTable, Long> {

    BookTable save(BookTable bookTable);

    Optional<BookTable> findById(Long id);

    void delete(BookTable bookTable);
    
    @Query("SELECT b FROM BookTable b ORDER BY b.name DESC")
    List<BookTable> findTop3ByName();
    
} 