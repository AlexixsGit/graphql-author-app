package com.example.graphql.config;

import com.example.graphql.model.Author;
import com.example.graphql.model.Book;
import com.example.graphql.repository.AuthorRepository;
import com.example.graphql.repository.BookRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ConfigurationApp {
    @Bean
    ApplicationRunner applicationRunner(AuthorRepository authorRepository, BookRepository bookRepository){
        return args -> {
            Author josh = authorRepository.save(new Author(null, "Josh Long"));
            Author mark = authorRepository.save(new Author(null, "Mark Heckler"));
            bookRepository.saveAll(List.of(new Book("Reactive Spring","Josh", josh ),
                    new Book("Cloud native java", "Josh", josh),
                    new Book("Spring boot", "Mark", mark)));
        };
    }
}
