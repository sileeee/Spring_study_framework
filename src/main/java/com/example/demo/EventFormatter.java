package com.example.demo;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

//빈으로 등록 가능
@Component
public class EventFormatter implements Formatter<Event> { //처리할 타입 하나

    @Override
    public Event parse(String text, Locale locale)throws ParseException{ //Locale정보를 기반으로 바꿔줌
        return new Event(Integer.parseInt(text));
    }
    @Override
    public String print(Event object, Locale locale){
        return object.getId().toString();
    }
}
