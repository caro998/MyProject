package com.example.bookapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApiApplication {

    public static void main(String[] args) {
        Book book = new Book(1L, "Things Fall Apart", "Chinua Achebe");

        System.out.println(book.getTitle());
        SpringApplication.run(BookApiApplication.class, args);
    }

}
