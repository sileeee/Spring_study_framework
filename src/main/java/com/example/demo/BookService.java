package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class BookService {

    @Autowired
    BookRepository bookRepository;

    public void printBookRepository(){ //BookService에 어떤 Repository가 주입받았는지 출력
        System.out.println(bookRepository.getClass());
    }
}
