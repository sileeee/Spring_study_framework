package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args)throws Exception{
        Event event = new Event();
        EventValidator eventValidator = new EventValidator();

        Errors errors = new BeanPropertyBindingResult(event, "event");
        // 이 과정들은 spring mvc에서 사용할 때는 자동으로 넘어감 ( 직접 이 클래스를 사용할 일이 별로 없음 )

        eventValidator.validate(event, errors); //errors에 검증에러를 담음

        System.out.println(errors.hasErrors()); //에러있는지 확인
        errors.getAllErrors().forEach(e -> { //모든 에러를 가져와 순회하면서 errorCode들을 찍음
            System.out.println("===error code===");
            Arrays.stream(e.getCodes()).forEach(System.out::println);
            System.out.println(e.getDefaultMessage());
        });
    }
}
