package com.example3.HiberOneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example3.model.department;
import com.example3.model.employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        
        try 
        {
        department department=new department();
        department.setName("IT");
        
        employee employee1=new employee();
        employee1.setName("Amit");
        employee1.setDepartment(department);
        
        employee employee2=new employee();
        employee2.setName("Arun");
        employee2.setDepartment(department);
        
        department.getEmployees().add(employee1);
        department.getEmployees().add(employee2);
        session.beginTransaction();
        session.save(department);
        session.getTransaction().commit();
        }  
        finally 
        {
        	session.close();
        	sessionFactory.close();
        }
        
        
        
    }
}



