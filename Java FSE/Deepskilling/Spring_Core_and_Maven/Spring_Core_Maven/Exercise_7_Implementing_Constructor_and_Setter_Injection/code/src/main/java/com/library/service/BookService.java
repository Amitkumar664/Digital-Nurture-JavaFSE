package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository constructorRepository;
    private BookRepository setterRepository;

    // Constructor Injection
    public BookService(BookRepository constructorRepository) {
        this.constructorRepository = constructorRepository;
    }

    // Setter Injection
    public void setSetterRepository(BookRepository setterRepository) {
        this.setterRepository = setterRepository;
    }

    public void displayBooks() {

        System.out.println("Constructor Injection");

        constructorRepository.getBookDetails();

        System.out.println();

        System.out.println("Setter Injection");

        setterRepository.getBookDetails();
    }
}