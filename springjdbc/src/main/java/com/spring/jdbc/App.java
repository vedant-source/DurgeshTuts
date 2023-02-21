package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.dao.StudentDao;
import com.spring.dao.StudentDaoImpl;
import com.spring.dto.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started...!!!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDaoImpl sd = context.getBean("studentDaoImpl",StudentDaoImpl.class);
        
        //Inserted record and then commented
//        Student s = new Student();
//        s.setId(8);
//        s.setName("Sarvesh Bhoomkar");
//        s.setCity("Buldhana");
//        
//        sd.insert(s);
       
//        Student ss = new Student();
//        ss.setId(8);
//        ss.setName("Raj Kale");
//        ss.setCity("Beed");
//         sd.update(ss);
        
//        Student sss = new Student();
//        sss.setId(8);
//        sd.deleteById(sss);
//   
 
// 		System.out.println(sd.getStudentById(8));
   
        List< Student> students =   sd.getAllStudents();
        for (Student student : students) {
			System.out.println(student);
		}
    }
}
