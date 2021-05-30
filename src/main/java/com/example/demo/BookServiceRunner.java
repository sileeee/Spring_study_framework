package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceRunner implements ApplicationRunner {

//    해당 타입의 빈 모두 주입받기
//    @Autowired
//    List<BookRepository> bookRepositoryList;
//    public void printBookRepository(){
//        this.bookRepositoryList.forEach(System.out::println);
//    }

    @Autowired
    BookService bookService;

    @Override
    public void run(ApplicationArguments args)throws Exception{
        bookService.printBookRepository();
    }
}
