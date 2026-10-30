package com.example.bookmanagement.service;

import com.example.bookmanagement.entity.Book;
import com.example.bookmanagement.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    public Optional<Book>  getBookById(Long id) {
        return bookRepository.findById(id);
    }
    public Book updateBookTitle(Long  id, String title) {
        Book book = bookRepository.findById(id).orElseThrow();
        book.setTitle(title);
        return bookRepository.save(book);
        }
    public String deleteBookById(Long id) {
        bookRepository.deleteById(id);
                return "Book successfully deleted!";
        }
    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        return bookRepository.save(book);
        }
    }
