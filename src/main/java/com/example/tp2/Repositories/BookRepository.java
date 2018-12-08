package com.example.tp2.Repositories;
import java.util.List;

import com.example.tp2.Entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

    Book findByTitle(String title);
}