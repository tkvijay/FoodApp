package com.foodApp.foodAppApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodApp.foodAppApi.model.BookTable;
import com.foodApp.foodAppApi.repository.BookTableRepository;

@Service
public class BookTableService {
    
    @Autowired
    private final BookTableRepository bookTableRepository;
    public BookTableService(BookTableRepository bookTableRepository){
        this.bookTableRepository = bookTableRepository;
    }

    public List<BookTable> getBookTables(){
        return bookTableRepository.findAll();
    }

    public Optional<BookTable> getBookTableById(Long id) {
        return bookTableRepository.findById(id);
    }

    public BookTable createBookTable(BookTable bookTable){
        return bookTableRepository.save(bookTable);
    }

    public BookTable updateBookTable(Long id, BookTable bookTableDetails){
        return bookTableRepository.findById(id)
            .map(bookTable -> {
                bookTable.setName((bookTableDetails.getName()));
                bookTable.setEmail(bookTableDetails.getEmail());
                bookTable.setPhone((bookTableDetails.getPhone()));
                bookTable.setDate((bookTableDetails.getDate()));
                bookTable.setTime((bookTableDetails.getTime()));
                bookTable.setNumberOfPeople((bookTableDetails.getNumberOfPeople()));
                return bookTableRepository.save(bookTable);
            })
            .orElseThrow(() -> new RuntimeException("BookTable not found with id " + id));


    public Optional<BookTable> deleteBookTable(Long id){    
        return bookTableRepository.findById(id)
            .map(bookTable -> {
                bookTableRepository.delete(bookTable);
                return bookTable;
            });
     }

    public  List<BookTable> findTopThree(){
        return bookTableRepository.findTop3ByName();    
    }
}
}
