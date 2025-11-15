package com.edu.vnrvjiet.bms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManagementService {

    @Autowired
    private BookManagementServiceRepository bookRepository;

    public Book addOneBook(Book book){
        return bookRepository.add(book);
    }

    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }

    public Book findById(Integer id){
        return bookRepository.findById(id);
    }

    public Book deleteById(Integer id){
        return bookRepository.deleteById(id);
    }

    public Book updateBook(Book book){
        return bookRepository.update(book);
    }
}

