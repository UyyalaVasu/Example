package com.student.student.service;

import java.util.List;


public interface StudentService {

	public String findNameById(Integer id);
	public List<Integer> findAge(String s_name);
	public void deleteById(Integer id);
	public Student saveStudent(Student student);
	System.out.println("Student Service file");

}
