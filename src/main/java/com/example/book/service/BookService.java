package com.example.book.service;

import com.example.book.entity.Book;
import com.example.book.repository.BookRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public Book add(Book book) {

        Book savedBook = repo.save(book);

        return savedBook;
    }

    public List<Book> all() {

        List<Book> books = repo.findAll();

        return books;
    }

    public Book one(Long id) {

        Book book = repo.findById(id).orElse(null);

        return book;
    }

    public Book update(Long id, Book book) {

        Book oldBook = repo.findById(id).orElse(null);

        if (oldBook == null) {
            return null;
        }

        oldBook.title = book.title;
        oldBook.author = book.author;
        oldBook.isbn = book.isbn;

        Book updatedBook = repo.save(oldBook);

        return updatedBook;
    }

    public boolean delete(Long id) {

        boolean exists = repo.existsById(id);

        if (!exists) {
            return false;
        }

        repo.deleteById(id);

        return true;
    }
}