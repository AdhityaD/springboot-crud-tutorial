package com.javaspring.springbootcrud.service.Impl;


import com.javaspring.springbootcrud.entity.Book;
import com.javaspring.springbootcrud.repository.BookRepository;
import com.javaspring.springbootcrud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService  {

    @Autowired
    BookRepository bookRepository;



    @Override
    public List<Book> SaveBooks(List<Book> books) {
        return bookRepository.saveAll(books);
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book SaveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public Book getBookByName(String name) {
        return bookRepository.findOneByName(name);
    }

    @Override
    public Book updateBook(Book book) {
        Book existingBook = bookRepository.findById(book.getId()).orElse(null);
        existingBook.setName(book.getName());
        existingBook.setQuantity(book.getQuantity());
        existingBook.setPrice(book.getPrice());
        return bookRepository.save(existingBook);
    }

    @Override
    public String deleteBook(int id) {
        bookRepository.deleteById(id);
        return "book removed"+ id;
    }
}
