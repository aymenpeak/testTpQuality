package com.example.tp2.Repositories;
import java.util.List;

import com.example.tp2.Entities.Book;
import com.example.tp2.Entities.Cart;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class CartRepositoryImpl implements CartRepository {
    @Override
    public Cart addBook(Cart cart ,Book book) {
        cart.getBooks().add(book);
        this.save(cart);
        return  cart;
    }
}