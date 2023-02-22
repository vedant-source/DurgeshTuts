package com.spring.orm;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao =  context.getBean("studentDao",StudentDao.class);
        Scanner sc= new Scanner(System.in);
        
        boolean flag = true;
        while (flag) {
        	 System.out.println("Press 1 : To Add New Student");
             System.out.println("Press 2 : To Display All Students");
             System.out.println("Press 3 : To Display Single Student");
             System.out.println("Press 4 : To Delete Students");
             System.out.println("Press 5 : To Update Student");
             System.out.println("Press 6 : EXIT");
             
             try {
				
            	 int input = sc.nextInt();
            	 
            	 switch (input) {
				case 1:
					System.out.println("Enter Details : id, firstName, city");
					Student s = new Student(sc.nextInt(),sc.next(),sc.nextLine());
					studentDao.insert(s);
					System.out.println("Record Inserted..!!!");			
					break;
				
				case 2:
					System.out.println("*****CLUB*****");
					List<Student> sList=studentDao.getAllStudets();
					for(Student stu : sList){
						System.out.println(stu);
					}
					break;
				
				case 3:
					System.out.println("Enter the Id to get single student's details");
					int id = sc.nextInt();
					System.out.println("*****StudentRecord*****");
					Student ss = studentDao.getStudentById(id);
					System.out.println(ss);
				break;

				case 4:
					System.out.println("Enter the Id to delete student's details");
					int delid = sc.nextInt();
					studentDao.deleteStudentById(delid);
					System.out.println("Record Deleted..!!!");
				break;
				
				case 5:
					Student sss = new Student(sc.nextInt(),sc.nextLine(),sc.nextLine());
					studentDao.updateStudent(sss);
					System.out.println("Record Updated..!!!");
					break;
					
				case 6:
					flag = false;
					break;
            	 }
  
			} catch (Exception e) {
				System.out.println("Invalid Input ...!!!");
				e.getMessage();
			}
			
		}
 
    }
}
