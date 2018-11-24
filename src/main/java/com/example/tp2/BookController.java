package com.example.tp2;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.example.tp2.Entities.Book;
import com.example.tp2.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    BookRepository _bookRepository;


    @PostMapping("/book/save")
    public String save(Book book) {
        if(!this._bookRepository.findByTitle(book.getTitle()).isEmpty()){
            return "book existant !";
        }else{
            this._bookRepository.save(book);
            return book.getId().toString();
        }
    }
    @GetMapping("/books")
    public Iterable<Book> getAll() {
        return this._bookRepository.findAll();
    }

    @PostMapping("/book/find")
    public Book getByTitle(String title) {
        Iterable<Book> l = this._bookRepository.findByTitle(title);
        if(((List<Book>) l).size()> 0){
            return  ((List<Book>) l).get(0);
        }
        return null;
    }
}