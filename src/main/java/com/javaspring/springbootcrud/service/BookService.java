package com.javaspring.springbootcrud.service;


import com.javaspring.springbootcrud.entity.Book;
import com.javaspring.springbootcrud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public Book SaveBook(Book book){
        return repository.save(book);
    }

    public List<Book> SaveBooks(List<Book> books){
        return repository.saveAll(books);
    }

    public Book getBookById (int id){
        return repository.findById(id).orElse(null);
    }

    public List<Book> getBooks(){
        return repository.findAll();
    }

    public Book getBookByName (String name){
        return repository.findByName(name);
    }

    public String deleteBook(int id){
        repository.deleteById(id);
        return "Product Removed ||" +id;
    }

    public Book updateBook (Book book){
        Book existingBook = repository.findById(book.getId()).orElse(null);
        existingBook.setName(book.getName());
        existingBook.setId(book.getId());
        existingBook.setPrice(book.getPrice());
        existingBook.setQuantity(book.getQuantity());
        return repository.save(existingBook);
    }
}
