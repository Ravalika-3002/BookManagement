package com.edu.vnrvjiet.bms;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class BookManagementServiceRepository {

    HashMap<Integer, Book> idAndBookHashMap = new HashMap<>();

    public Book add(Book book){
        if(book != null && !idAndBookHashMap.containsKey(book.getId())){
            idAndBookHashMap.put(book.getId(), book);
        }
        return book;
    }

    public List<Book> findAll(){
        return new ArrayList<>(idAndBookHashMap.values());
    }

    public Book findById(Integer id){
        Book book = null;
        if(id != null && idAndBookHashMap.containsKey(id)){
            book = idAndBookHashMap.get(id);
        }
        return book;
    }

    public Book deleteById(Integer id){
        Book book = null;
        if(id != null && idAndBookHashMap.containsKey(id)){
            book = idAndBookHashMap.get(id);
            idAndBookHashMap.remove(id);
        }
        return book;
    }

    public Book update(Book book){
        Book existingBook = null;
        if(book != null && idAndBookHashMap.containsKey(book.getId())){
            existingBook = idAndBookHashMap.get(book.getId());
            existingBook.setBookName(book.getBookName());
            existingBook.setBookCount(book.getBookCount());
        }
        return existingBook;
    }
}
