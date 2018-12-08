package com.example.tp2;

import com.example.tp2.Entities.Book;
import com.example.tp2.Repositories.BookRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

public class BookRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private BookRepository bookRepository;
    @Test
    public void whenFindByTitle_thenReturnBook() {
        // given
        Book book = new Book("titre", "author", 12, 12);
        entityManager.persist(book);
        entityManager.flush();

        // when
        Book found = bookRepository.findByTitle(book.getTitle());

        // then
        assertThat(found.getTitle())
                .isEqualTo(book.getTitle());
    }
}
