package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
		/*
		 * JdbcTemplate template = context.getBean("jdbcTemplate" , JdbcTemplate.class);
		 * 
		 * //insert query
		 * 
		 * String query = "insert into student(id, name, city) Values(?,?,?)";
		 * 
		 * //fire the query
		 * 
		 * int result = template.update(query, 456, "Rohit Tambare", "Solapur");
		 * System.out.println("number of records inserted.."+result);
		 */ 
        
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
	//insert the student
        /*
		 * Student student = new Student(); student.setId(455);
		 * student.setName("Pushpak Todankar"); student.setCity("Ratnagiri");
		 * 
		 * int result = studentDao.insert(student);
		 * 
		 * System.out.println("number of records inserted.."+result);
		 */
     
        //update student
		/*
		 * Student student = new Student(); student.setId(0); student.setCity("Pune");
		 * student.setName("Sourabh");
		 * 
		 * int result = studentDao.update(student);
		 * System.out.println("data changed"+result);
		 */   
        //delete student
        
		/*
		 * int result = studentDao.delete(0); System.out.println("deleted"+result);
		 */
        
		/*
		 * Student student = studentDao.getStudent(222);
		 * System.out.println(student);
		 */
        
        List<Student> students = studentDao.getAllStudents();
        for(Student s:students) {
        	System.out.println(s);
        }
        
    }
}
