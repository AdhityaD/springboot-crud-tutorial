package com.javaspring.springbootcrud.repository;

import com.javaspring.springbootcrud.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    Book findOneByName (String name);
    Book findOneByQuantity (int quantity);
}
