package com.example.demo;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent { //4.2부터는 상속받지 않아도 이벤트로 사용 가능

    private int data;

    public MyEvent(Object source){ //빈으로 등록x ,이벤트를 발생시킨 소스만 전송
        super(source);
    }

    public MyEvent(Object source, int data){ //데이터를 실어서 전송 가능
        super(source);
        this.data = data;
    }

    public int getData(){
        return data;
    }
}
