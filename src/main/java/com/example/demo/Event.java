package com.example.demo;

import javax.validation.constraints.*;

public class Event {

    Integer id;

    //BeanValidationAnnotation
    @NotEmpty
    String title; //Empty이므로 errors에 error을 담음

    @NotNull @Min(0) //최소값 0
    Integer limit;

    @Email
    String email;

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

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
