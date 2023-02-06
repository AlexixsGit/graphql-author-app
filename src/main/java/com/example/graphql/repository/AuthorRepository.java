package com.example.graphql.repository;

import com.example.graphql.model.Author;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository {
    Iterable<Author> findAll();

    Author save(Author author);
}
