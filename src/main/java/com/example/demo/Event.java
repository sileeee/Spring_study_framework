package com.example.demo;

public class Event {

    Integer id;
    String title; //Empty이므로 errors에 error을 담음

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
