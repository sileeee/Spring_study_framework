package com.example.demo;

import java.beans.PropertyEditorSupport;

public class EventEditor extends PropertyEditorSupport {
    //text를 event로 변환해야 함


    @Override
    public String getAsText(){
        Event event = (Event)getValue(); //propertyEditor가 받은 객체를 getValue()로 가져올 수 있음(Object타입으로 반환-형변환)
        return event.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException{
        setValue(new Event(Integer.parseInt((text)))); //문자열을 숫자로 인식
    }

    // 이 때, value가 propertyEditor가 받은 객체인데 서로다른 스레드에게 공유가 됨
    // statePool한다. Thread-safe하지 않다.
    // 즉, PropertyEditor들의 구현체들은 여러 스레드에 공유해서 안된다
    // (*PropertyEditor은 빈으로 등록하면 안된다*)
}
