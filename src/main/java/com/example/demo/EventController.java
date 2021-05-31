package com.example.demo;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @GetMapping("/event/{event}")
    public String getEvent(@PathVariable Event event){ //event에 해당하는 부분을 event도메인타입으로 받음
        System.out.println(event);
        return event.getId().toString();//event의 Id출력
    }
}
//기본적으로 Integer타입과 같은 것들은 기본적으로 등록된 Converter이나 Formatter들이 자동으로 변환해줌
//모든 것을 이렇게 안해도 됨. 스프링이 기본적으로 등록되지 않은 것들을 이렇게 코딩하면 된다.
//@GetMapping("/event/{id}")
//public String getEvent(@PathVariable Integer id)...