package com.example.graphql.controller;

import com.example.graphql.repository.AuthorRepository;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
}
