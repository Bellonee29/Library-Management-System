package com.bookLibrary.library.implementation;

import com.bookLibrary.library.entity.Library;
import com.bookLibrary.library.entity.Teacher;
import com.bookLibrary.library.services.TeacherServices;

public class TeacherServiceImpl implements TeacherServices {

    @Override
    public String addTeacherToQueue(Library library, Teacher teacher) {
        library.getPeopleInQueue().offer(String.valueOf(teacher));
        return "";
    }
}
