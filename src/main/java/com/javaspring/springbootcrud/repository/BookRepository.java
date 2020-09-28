package com.javaspring.springbootcrud.repository;

import com.javaspring.springbootcrud.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
    Book findByName (String name);
}
