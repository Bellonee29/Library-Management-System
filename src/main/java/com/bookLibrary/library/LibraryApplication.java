package com.bookLibrary.library;

import com.bookLibrary.library.entity.*;
import com.bookLibrary.library.implementation.*;
import com.bookLibrary.library.services.LibraryServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Queue;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		Library library = new Library();

		Book book = new Book("Bellonee","Java First Edition", "448",4);




		LibraryServicesImp libraryServicesImp = new LibraryServicesImp();
		libraryServicesImp.addBook(book, library);
		System.out.println(library.getBooks());


		String getBookStatus = libraryServicesImp.bookStatus(book,library);
		System.out.println(getBookStatus);

		SeniorStudent seniorStudent = new SeniorStudent("Weng", 24,Level.STUDENT,"Java First Edition");
		Teacher teacher = new Teacher("MR Ubong",45, Level.TEACHER,"Java First Edition eee");
		JuniorStudent juniorStudent = new JuniorStudent("Bello", 25,Level.JUNIOR_STUDENT,"Java java");


		SeniorStudentServiceImp seniorStudentServiceImp = new SeniorStudentServiceImp();
		seniorStudentServiceImp.addSeniorStudentToQueue(library,seniorStudent);

		TeacherServiceImpl teacherService = new TeacherServiceImpl();
		teacherService.addTeacherToQueue(library,teacher);

		JuniorStudentServiceImp juniorStudentServiceImp = new JuniorStudentServiceImp();
		juniorStudentServiceImp.addJuniorStudentToQueue(library,juniorStudent);

		//System.out.println(library.getPeopleInQueue());
		String g = libraryServicesImp.getPeopeleInQueue(library,teacher,book);
		System.out.println(g);
		String f= libraryServicesImp.giveBookOnPriority(library,teacher,book,seniorStudent,juniorStudent);
		System.out.println(f);
		String h = libraryServicesImp.firstComeFirstServe(library,teacher,book,seniorStudent,juniorStudent);
		System.out.println(h);


		//System.out.println();

	}

}
