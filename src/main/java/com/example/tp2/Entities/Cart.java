package com.example.tp2.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy="cart")
    private List<Book> books;

    public Cart() {
        this.books = new ArrayList<Book>();
    }

    public Long getId() {
        return id;
    }

    public List<Book> getBooks() {
        return books;
    }
}
