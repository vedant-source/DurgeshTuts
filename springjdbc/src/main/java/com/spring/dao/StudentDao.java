package com.spring.dao;

import com.spring.dto.Student;

public interface StudentDao {
		public int insert(Student student);
		public int update(Student student);
		public int deleteById(Student student);
}
