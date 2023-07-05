package com.bookLibrary.library.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public abstract class Base {
    private String name;
    private Integer age;
    private Level level;
    private String bookRequestTitle;


    public Base(String name, Integer age, Level level, String bookRequestTitle) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.bookRequestTitle = bookRequestTitle;
    }

}
