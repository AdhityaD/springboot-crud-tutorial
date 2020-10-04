package com.javaspring.springbootcrud.service;


import com.javaspring.springbootcrud.entity.Book;
import com.javaspring.springbootcrud.repository.BookRepository;

import java.util.List;


public interface BookService {
    List <Book> SaveBooks (List<Book> books);
    List <Book> getBooks();
    Book SaveBook(Book book);
    Book getBookById(int id);
    Book getBookByName(String name);
    Book updateBook(Book book);
    String deleteBook(int id);


}
