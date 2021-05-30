package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationEventPublisher publishEvent; //AppilcationContext extends ApplicationEventPublisher이므로 ApplicationContext도 물론 가능

    @Override
    public void run(ApplicationArguments args)throws Exception{
        publishEvent.publishEvent(new MyEvent(this, 100));//이벤트 발생(ApplicationContext가 이벤트 발생시키는 기능이 있음)
    }
}
