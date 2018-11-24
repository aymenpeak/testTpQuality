package com.example.tp2;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.example.tp2.Entities.Book;
import com.example.tp2.Entities.Cart;
import com.example.tp2.Repositories.BookRepository;
import com.example.tp2.Repositories.CartRepository;
import com.example.tp2.Repositories.CartRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @Autowired(required = true)
    CartRepositoryImpl _cartRepository;
    @Autowired
    BookRepository _bookRepository;


    @PostMapping("/cart/addbook")
    public int addbook(Book book) {
        if(!this._bookRepository.findByTitle(book.getTitle()).isEmpty()){
            Cart cc = new Cart();
            Cart t = _cartRepository.addBook(cc,book);
            return t.getBooks().size();
        }else{
            return 92929;
        }
    }

}