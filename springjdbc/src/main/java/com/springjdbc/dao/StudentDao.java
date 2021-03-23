package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.entitiy.Student;

public interface StudentDao {
	
	public int insert(Student st);
	
	public int delete(Student st);
	
	public int change(Student st);
	
	
	public Student getStudent(int sid);
	
	
	public List<Student> getAllReord();
}
