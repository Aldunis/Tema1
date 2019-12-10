package com.company.Service;

import org.junit.jupiter.api.BeforeEach;

import java.io.FileNotFoundException;

public class BookServiceT {
    private BooksService bookService;

    @BeforeEach
    public void initial(){
        bookService = new BooksService();
    }
}
