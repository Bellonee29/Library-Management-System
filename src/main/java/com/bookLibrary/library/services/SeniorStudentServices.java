package com.bookLibrary.library.services;

import com.bookLibrary.library.entity.Library;
import com.bookLibrary.library.entity.SeniorStudent;

public interface SeniorStudentServices {
    String addSeniorStudentToQueue (Library library, SeniorStudent seniorStudent);
}
