package com.bookLibrary.library.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
@Getter
@Setter
@AllArgsConstructor

public class Library {
    List<Book> books;
    Queue<String> peopleInQueue;



    public Library(){
        books = new ArrayList<>();
        peopleInQueue = new LinkedList<>();
    }

}
