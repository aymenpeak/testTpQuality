package com.example.tp2;


import com.example.tp2.Entities.Book;
import com.example.tp2.Entities.Cart;
import com.example.tp2.Repositories.BookRepository;
import com.example.tp2.Repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @Autowired
    CartRepository _cartRepository;
    @Autowired
    BookRepository _bookRepository;


    @PostMapping("/cart/addbook")
    public int addbook(Book book) {
        if(!this._bookRepository.findByTitle(book.getTitle()).isEmpty()){
            Cart cc = new Cart();
            cc.getBooks().add(book);
            Cart t = _cartRepository.save(cc);
            return t.getBooks().size();
        }else{
            return 92929;
        }
    }

}