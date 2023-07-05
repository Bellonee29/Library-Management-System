package com.bookLibrary.library.services;

import com.bookLibrary.library.entity.*;

public interface LibraryServices {
    String addBook(Book book, Library library);

    String bookStatus(Book book, Library library);
    //String firstName(Library library, Teacher teacher);

    String getPeopeleInQueue(Library library, Teacher teacher, Book book);

    String giveBookOnPriority(Library library, Teacher teacher, Book book,
                              SeniorStudent seniorStudent, JuniorStudent juniorStudent);

    String firstComeFirstServe(Library library, Teacher teacher, Book book, SeniorStudent seniorStudent, JuniorStudent juniorStudent);
    //String firstComeFirstServe(Library library, Teacher teacher, Book book, SeniorStudent seniorStudent, JuniorStudent juniorStudent);
}