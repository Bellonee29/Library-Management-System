package com.bookLibrary.library.services;

import com.bookLibrary.library.entity.Library;
import com.bookLibrary.library.entity.Teacher;

public interface TeacherServices {
    String addTeacherToQueue (Library library, Teacher teacher);
}
