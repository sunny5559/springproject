package com.springjdbc.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.dao.Studentimpl;
import com.springjdbc.entitiy.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     //   System.out.println( "Hello World!" );
    	
            ApplicationContext  ac = new ClassPathXmlApplicationContext("config.xml");
           Studentimpl stim  = 	ac.getBean("st",Studentimpl.class);
           // Student st = new Student();
            //st.setId(12);
            //st.setName("Poonam");
            //st.setCity("NagDa");
            
         // int r  =  stim.insert(st);
          //    int r1  = stim.delete(st); 
         // System.out.println("Data inserted Sucessfully."+r);
         // System.out.println("Data Deleted Sucessfully."+r1);
           // int r2  = stim.change(st); 
           // System.out.println("Record Updated Sucessfully..."+r2);
           
			/*
			 * Student st = stim.getStudent(12); System.out.println(st);
			 */
           
           List<Student> ls = stim.getAllReord();
           for(Student st:ls)
           {
        	   System.out.println(st);
           }
           
    }
}
