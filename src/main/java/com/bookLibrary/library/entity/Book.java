package com.bookLibrary.library.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Book {
    private  String author;
    private  String title;
    private String id;
    private  Integer quantity;

}
