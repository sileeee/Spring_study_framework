package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
//@Qualifier("sieunBookRepository")
public class SieunBookRepository implements BookRepository{
}
