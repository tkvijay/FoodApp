package com.foodApp.foodAppApi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodApp.foodAppApi.model.BookTable;
import com.foodApp.foodAppApi.service.BookTableService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/booktable")
public class BookTableController {
    
private final BookTableService bookTableService;

    @Autowired
    public BookTableController(BookTableService bookTableService) {
        this.bookTableService = bookTableService;
    }

    @GetMapping
    public List<BookTable> getBookTable(){
        return bookTableService.getBookTables();
    }

    @PostMapping
    public BookTable createBookTable(@RequestBody BookTable bookTable){
        return bookTableService.createBookTable(bookTable);
    }

    @PutMapping("/{id}")
    public BookTable updateBookTable(@PathVariable Long id, @RequestBody BookTable bookTableDetails){
        return bookTableService.updateBookTable(id, bookTableDetails);
    }

    @DeleteMapping("/{id}")
    public Optional<BookTable> deleteBookTable(@PathVariable Long id){
        return bookTableService.deleteBookTable(id);
    }

    @GetMapping("/top3")
    public List<BookTable> findTopThree(){
        return bookTableService.findTopThree();
    }

    @GetMapping("/{id}")
    public Optional<BookTable> getBookTableById(@PathVariable Long id){
        return bookTableService.getBookTableById(id);
    }

    public BookTableService getBookTableService() {
        return bookTableService;
    }
}
