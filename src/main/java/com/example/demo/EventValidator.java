package com.example.demo;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EventValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz){
        return Event.class.equals(clazz); //clazz가 클래스 타입이 Event인지 확인
    }

    @Override
    public void validate(Object object, Errors errors){
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "notempty", "Empty title is now allowed");
        //errorCode : 실제 메세지를 가져올 수 있는 메세지의 key값
        //defaultMessage : errorCode로 메세지를 찾지 못했을 때 사용할 메세지
    }

}
