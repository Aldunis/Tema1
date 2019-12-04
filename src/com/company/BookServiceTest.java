package com.company.Service;

import com.company.Model.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookServiceTest {

    private BookService bookService;
    @BeforeEach
    void setUp() throws FileNotFoundException {
        System.out.println("trying to run setup");
        bookService = new BookService();
        assertEquals(3 , bookService.getNrofBooks() );
    }

    @AfterEach
    void tearDown() {
        System.out.println("trying to clean up");
    }

    @Test
    void addBook() {
        System.out.println("trying to addBook");
        Book book = new Book();
        book.setName("Harap-Alb");

        bookService.addBook(book);

        assertEquals(4, bookService.getNrofBooks() );

        assertEquals(5, bookService.getNrofBooks() );
    }

    @Test
    void getBookbyIndex() {
        System.out.println("trying to run getBookbyIndex");

        Book book = new Book();
        book.setName("Harap-Alb");
        book.setAuthor("Creanga");

        bookService.addBook(book);

    }

    @Test
    void getBookbyName() {
        System.out.println("trying to getBookbyName");
    }

    @Test
    void updateBook() {
        System.out.println("trying to updateBook");
    }

    @Test
    void deleteBook() {
        System.out.println("trying to deleteBook");
    }
}