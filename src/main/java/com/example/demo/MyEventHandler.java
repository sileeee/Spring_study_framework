package com.example.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler implements ApplicationListener<MyEvent> { //ApplicationListener<이벤트>구현한 클래스 만들어서 빈으로 등록
    //4.2부터는 특정 메소드를 구현하지 않아도 됨

    @Override
    public void onApplicationEvent(MyEvent event){
        System.out.println("이벤트 받음. 데이터는 "+event.getData());
    }


}
