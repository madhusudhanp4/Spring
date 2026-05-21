package com.hexaware.spring.layers.repository;

import java.util.List;

import com.hexaware.spring.layers.beans.Student;

public interface IStudentRepository {
	

	public  int   addStudent(Student student);

    public int updateStudent(Student student);

    public Student getStudentById(int sid);

    public int deleteStudentById(int sid);
	
	public  List<Student>  getAllStudents();
}
