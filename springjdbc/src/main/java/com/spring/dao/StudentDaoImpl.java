package com.spring.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.dto.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		  String query = "insert into student(id,name,city) value (?,?,?)";
	        //fire query
	        int result = jdbcTemplate.update(query, student.getId(),student.getName(), student.getCity());
	        System.out.println("Record Inserted...!!!  " + result);
		return result;
	}

	public int update(Student student) {
			String query = "update student set name = ? , city = ? where id = ?";
			int result = jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
			 System.out.println("Record Updated...!!!  " + result);
		return result;
	}

	public int deleteById(Student student) {
	// delete by id
		String query = "delete from student where id = ? ";
		int result = jdbcTemplate.update(query, student.getId());
		System.out.println("Record Deleted...!!!  " + result);
		return 0;
	}

	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
