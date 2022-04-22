package com.practica.jason.bootstrap;

import com.practica.jason.models.Book;
import com.practica.jason.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book bookDDD = new Book(null, "JPA 2", "123", "RandomHouse");
        Book bookSaved = bookRepository.save(bookDDD);

        Book bookSIA = new Book(null, "Spring In Action", "2334", "Oreily");
        Book bookSIASaved = bookRepository.save(bookSIA);
    }

}
