package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//SpringBoot없이 WebMVC를 사용하는 경우
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry){ //registry에 converter등록
        registry.addFormatter(new EventFormatter()); //EventConverter등록
    }
//스프링 mvc설정(WebMvcConfigurer)에 등록된 Converter가 모든 컨트롤러에 동작함, 컨트롤러에 요청한 "1"이 converter에서 Event로 변환되어 Event타입으로 받을 수 있음
}
