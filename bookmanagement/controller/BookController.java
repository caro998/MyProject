package com.example.bookmanagement.controller;

import com.example.bookmanagement.entity.Book;
import com.example.bookmanagement.service.BookService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.List;

@RestController
public class BookController {
    private BookService bookService;
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    @GetMapping("/api/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @GetMapping("/api/books/{id}")
    public Book getBookById(@PathVariable Long id){
        return bookService.getBookById(id).orElseThrow();
    }
    @PostMapping("/api/books")
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book.getTitle(), book.getAuthor());
    }
    @PutMapping("/api/books/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book){
        return bookService.updateBookTitle( id, book.getTitle());
    }
    @DeleteMapping("/api/books/{id}")
    public String deleteBookById(@PathVariable Long id){
        return bookService.deleteBookById(id);
    }

}
