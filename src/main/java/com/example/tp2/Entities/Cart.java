package com.example.tp2.Entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy="cart")
    private Set<Book> books;


    public Long getId() {
        return id;
    }

    public Set<Book> getBooks() {
        return books;
    }
}
