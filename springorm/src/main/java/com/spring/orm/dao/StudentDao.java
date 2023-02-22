package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.orm.entities.Student;


public class StudentDao {
			

		private HibernateTemplate hibernateTemplate; 
		//CRUD
		
		@Transactional
		//insert
		public int insert(Student student) {
			Integer i =  (Integer) this.hibernateTemplate.save(student);
			return  i ;
		}
		
		//get single data obj
		
		public Student getStudentById(int id) {
		 Student student = this.hibernateTemplate.get(Student.class, id);
		return student;
		}
		
		//get all data
		
		public List<Student> getAllStudets(){
			List<Student> students = this.hibernateTemplate.loadAll(Student.class);
			return students;
		}
		
		//deleting obj by id
		@Transactional
		public void deleteStudentById(int id) {
			 Student student = this.hibernateTemplate.get(Student.class, id);
			 this.hibernateTemplate.delete(student);
		}
		
		//Update obj
		@Transactional
		public void updateStudent(Student student) {
			this.hibernateTemplate.update(student);
		}
		
		public HibernateTemplate getHibernateTemplate() {
			return hibernateTemplate;
		}
	
		public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
			this.hibernateTemplate = hibernateTemplate;
		}
	
	
}
