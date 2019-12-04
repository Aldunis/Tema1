package com.company.Service;

import org.junit.jupiter.api.BeforeEach;

import java.io.FileNotFoundException;

public class BookServiceT {

    private BookService bookService;

    @BeforeEach
    public void initial() throws FileNotFoundException {
        bookService = new BookService();

    }
}
