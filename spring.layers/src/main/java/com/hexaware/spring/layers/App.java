package com.hexaware.spring.layers;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.spring.layers.beans.Student;
import com.hexaware.spring.layers.service.IStudentService;
import com.hexaware.spring.layers.service.StudentServiceImp;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		IStudentService service = context.getBean(StudentServiceImp.class);

		System.out.println(service);

		Student student = context.getBean(Student.class);

		//INSERT
		student.setSid(103);
		student.setSname("King");

		int count = service.addStudent(student);

		System.out.println(count + " record added to DB");
		
		//UPDATE
		student.setSid(103);
		student.setSname("Queen");
		
		int updateCount = service.updateStudent(student);
		System.out.println(updateCount + " record udpated");
		
		//GET BY ID
		Student s = service.getStudentById(103);
		System.out.println("Fetched Student: " + s);
		
		//DELETE
		int deleteCount = service.deleteStudentById(103);
		System.out.println(deleteCount + " record deleted");
		
		//FETCH ALL
		List<Student> list = service.getAllStudents();

		list.forEach(System.out::println); // list.forEach( (s1)->{ System.out.println(s1);});

	}
}
