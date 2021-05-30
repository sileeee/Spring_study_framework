package com.example.demo;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    // Property Editor을 쓰는 법 - Controller에서 사용할 바인더들을 등록하는 방법
    // WebDataBinder가 DataBinder 구현체 중의 하나
    // 전역적으로 하는 방법도 있음
    @InitBinder
    public void init(WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(Event.class, new EventEditor());
    } //webDataBinder라는 곳에 event 클래스 타입을 처리할 PropertyEditor을 등록

    @GetMapping("/event/{event}")
    public String getEvent(@PathVariable Event event){ //event에 해당하는 부분을 event도메인타입으로 받음
        System.out.println(event);
        return event.getId().toString();//event의 Id출력
    }
}
