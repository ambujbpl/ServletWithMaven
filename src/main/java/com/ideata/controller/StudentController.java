package com.ideata.controller;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ideata.model.Student;

public class StudentController {
	public static void main(String[] args) throws SecurityException, HeuristicMixedException, HeuristicRollbackException, RollbackException, SystemException
	{
//	public Student getStudent() throws SecurityException, HeuristicMixedException, HeuristicRollbackException, RollbackException, SystemException
//	{
		Student st = new Student();
		st.setId(101);
		st.setName("Rahul");
		st.setRoll("0105EC1201");
		st.setSubject("Math");
		
		System.out.println("student obj is : "+st.toString());
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
		
		SessionFactory sf = con.buildSessionFactory();		
		
		Session session = sf.openSession();
		
		org.hibernate.Transaction tx = session.beginTransaction();
		
		session.save(st);
		tx.commit();
//		return st;
	}
}
