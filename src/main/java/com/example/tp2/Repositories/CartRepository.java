package com.example.tp2.Repositories;
import java.util.List;

import com.example.tp2.Entities.Book;
import com.example.tp2.Entities.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {
    public Cart addBook(Cart cart ,Book book);
}