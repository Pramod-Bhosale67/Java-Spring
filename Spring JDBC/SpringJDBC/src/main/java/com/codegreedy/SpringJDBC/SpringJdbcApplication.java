package com.codegreedy.SpringJDBC;

import com.codegreedy.SpringJDBC.model.Student;
import com.codegreedy.SpringJDBC.services.StudentServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Student stud = context.getBean(Student.class);
		stud.setRollNo(100);
		stud.setName("Pramod");
		stud.setMarks(87);

		StudentServices services = context.getBean(StudentServices.class);
		services.addStudent(stud);

		List<Student> studentList = services.getStudents();
		System.out.println(studentList);


	}

}
