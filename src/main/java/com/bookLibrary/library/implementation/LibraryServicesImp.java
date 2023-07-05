package com.bookLibrary.library.implementation;

import com.bookLibrary.library.entity.*;
import com.bookLibrary.library.services.LibraryServices;

import java.util.Objects;
import java.util.stream.Stream;

public class LibraryServicesImp implements LibraryServices {


    @Override
    public String addBook(Book book, Library library) {
       library.getBooks().add(book);
        return "";
    }

    @Override
    public String bookStatus(Book book, Library library) {
        if (library.getBooks() == null)
            return "There is no book available";
        return null;
    }

    @Override
    public String getPeopeleInQueue(Library library, Teacher teacher, Book book) {
        for (String peopleInQueue : library.getPeopleInQueue()) {
            System.out.println(peopleInQueue);
        }
        return "";
    }

    @Override
    public String giveBookOnPriority(Library library, Teacher teacher, Book book,
                                     SeniorStudent seniorStudent, JuniorStudent juniorStudent) {
        if (book.getQuantity() > 0) {
            Stream.of(teacher, seniorStudent, juniorStudent)
                    .filter(person -> library.getPeopleInQueue().contains(person.getBookRequestTitle())
                            == library.getBooks().contains(book.getTitle()) && book.getQuantity() > 0)
                    .forEach(student -> {
                        System.out.println(student.getLevel() + " has been given " + student.getBookRequestTitle());
                        book.setQuantity(book.getQuantity() - 1);
                        library.getPeopleInQueue().poll();
                    });
        } else {
            return "The book is not available in the library";
        }
        return "";

    }


    @Override
    public String firstComeFirstServe(Library library, Teacher teacher, Book book, SeniorStudent seniorStudent, JuniorStudent juniorStudent) {
        Stream.of(seniorStudent, juniorStudent, teacher)
                .filter(student -> library.getPeopleInQueue().contains(student.getBookRequestTitle())
                        == library.getBooks().contains(book.getTitle()) && book.getQuantity() > 0)
                .forEach(student -> {
                    System.out.println((student.getLevel() + " has been given " + student.getBookRequestTitle()));
                    book.setQuantity(book.getQuantity() - 1);
                    library.getPeopleInQueue().poll();
                });

        return "The book is not available in the library";
    }
    }

