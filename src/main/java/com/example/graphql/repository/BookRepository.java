package com.example.graphql.repository;

import com.example.graphql.model.Book;

import java.util.List;

public interface BookRepository {
    void saveAll(List<Book> books);
}
