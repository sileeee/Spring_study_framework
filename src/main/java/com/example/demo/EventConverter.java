package com.example.demo;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

public class EventConverter {
    //빈으로 등록 가능
//    @Component
    public static class StringToEventConverter implements Converter<String, Event> { //<source, target>
        @Override
        public Event convert(String source) {
            return new Event(Integer.parseInt(source));
        }
    }
//    @Component
    public static class EventToStringConverter implements Converter<Event, String> {
        @Override
        public String convert(Event source){
            return source.getId().toString();
        }
    }

}
