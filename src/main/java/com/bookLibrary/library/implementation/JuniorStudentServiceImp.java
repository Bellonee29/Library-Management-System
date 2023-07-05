package com.bookLibrary.library.implementation;

import com.bookLibrary.library.entity.JuniorStudent;
import com.bookLibrary.library.entity.Library;
import com.bookLibrary.library.services.JuniorStudentServices;

public class JuniorStudentServiceImp implements JuniorStudentServices {
    @Override
    public String addJuniorStudentToQueue(Library library, JuniorStudent juniorStudent) {
        library.getPeopleInQueue().offer(String.valueOf(juniorStudent));
        return "";
    }
}
