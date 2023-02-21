package com.spring.dao;

import java.util.List;

import com.spring.dto.Student;

public interface StudentDao {
		public int insert(Student student);
		public int update(Student student);
		public int deleteById(Student student);
		public Student getStudentById(int id);
		public List<Student> getAllStudents() ;
}
