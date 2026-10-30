package com.example.bookapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello! Welcome to the Book API.";
    }
    @GetMapping("/api/books/{id}")
    public Book getbook(@PathVariable long id){
        return new Book(id, "Things fall apart", "Chinua Achebe");
    }
}
