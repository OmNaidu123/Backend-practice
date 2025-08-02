package com.example.javaJDBCexP;

import com.example.javaJDBCexP.models.Student;
import com.example.javaJDBCexP.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class JavaJdbCexPApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(JavaJdbCexPApplication.class, args);
		Student s1 = context.getBean(Student.class);
		s1.setRollNo(104);
		s1.setMarks(87);
		s1.setName("Akash");
		StudentService service = context.getBean(StudentService.class);
		//service.addStudent(s1);
		List<Student> list = service.getAllStudents();
		list.forEach(s-> System.out.println(s.toString()));
	}

}
