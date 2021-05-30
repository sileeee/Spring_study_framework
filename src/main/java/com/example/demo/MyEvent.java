package com.example.demo;

public class MyEvent { //4.2부터는 상속받지 않아도 이벤트로 사용 가능

    //스프링 프레임워크가 추구하는 철학 - 비침투성(스프링 소스코드가 노출x)
    //프레임워크의 코드가 노출x -> POJO기반 코드
    //==> 테스트와 유지보수하기 쉬워진다.
    private int data;
    private Object source;

    public MyEvent(Object source, int data){ //데이터를 실어서 전송 가능
        this.source = source;
        this.data = data;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getData(){
        return data;
    }
}
