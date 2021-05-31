package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)


//slicing test : 계층형 테스트로 웹과 관련된 빈만 등록해주는 테스트
//즉, controller들만 등록됨. 그래서 converter과 formatter이 제대로 빈으로 등록 안되어있으면 test가 깨질 수 있음
//이런 경우, @WebMvcTest안에 테스트에 필요한 converter나 formatter을 빈으로 등록할 수 있다
@WebMvcTest({EventFormatter.class, EventController.class})
class EventControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getTest() throws Exception{
        mockMvc.perform(get("/event/1")).andExpect(status().isOk()).andExpect(content().string("1"));
        //get요청("/event/1"), 응답이 200으로 나와서 문제 없어야 하며, id값 1출력 되어야함
    }

}