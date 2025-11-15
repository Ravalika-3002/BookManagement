package com.edu.vnrvjiet.bms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bookmanagement")
public class BookManagementController {

    @Autowired
    private BookManagementService bookService;

    @PostMapping("addOne")
    public ResponseEntity<Book> addOneBook(@RequestBody Book book){
        book = bookService.addOneBook(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @GetMapping("findAll")
    public ResponseEntity<List<Book>> findAllBooks(){
        List<Book> bookList = bookService.findAllBooks();
        return new ResponseEntity<>(bookList, HttpStatus.OK);
    }

    @GetMapping("findById")
    public ResponseEntity<Book> findById(@RequestParam Integer id){
        Book book = bookService.findById(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @DeleteMapping("deleteById")
    public ResponseEntity<Book> deleteById(@RequestParam Integer id){
        Book book = bookService.deleteById(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        book = bookService.updateBook(book);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
}
