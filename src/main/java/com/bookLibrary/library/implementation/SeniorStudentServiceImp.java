package com.bookLibrary.library.implementation;

import com.bookLibrary.library.entity.Library;
import com.bookLibrary.library.entity.SeniorStudent;
import com.bookLibrary.library.services.SeniorStudentServices;

public class SeniorStudentServiceImp implements SeniorStudentServices {
    @Override
    public String addSeniorStudentToQueue(Library library, SeniorStudent seniorStudent) {
        library.getPeopleInQueue().offer(String.valueOf(seniorStudent));
        return "";
    }
}
