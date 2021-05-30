package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    Validator validator; //스프링이 이 validator을 주입받음

    @Override
    public void run(ApplicationArguments args)throws Exception{
        System.out.println(validator.getClass());

        Event event = new Event();
        event.setEmail("aaa2"); //에러
        event.setLimit(-1);
        Errors errors = new BeanPropertyBindingResult(event, "event");
        // 이 과정들은 spring mvc에서 사용할 때는 자동으로 넘어감 ( 직접 이 클래스를 사용할 일이 별로 없음 )

        validator.validate(event, errors); //빈으로 주입받은 validator

        System.out.println(errors.hasErrors()); //에러있는지 확인

        //모든 에러를 가져와 순회하면서 errorCode들을 찍음
        errors.getAllErrors().forEach(e -> {
            System.out.println("===error code===");
            Arrays.stream(e.getCodes()).forEach(System.out::println);
            System.out.println(e.getDefaultMessage());
        });
    }
}
