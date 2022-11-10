package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Student;

public class StudentUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Student s=new Student();
		s.setIdentityNumber(2);
		s.setName("Rajan");
		s.setAddress("Hyderabad");
		s.setPhone(998937);
		s.setPincode(8431111);
		//s.setFather_name(fname);
		//s.setMother_name(mname);
		entityTransaction.begin();
		entityManager.merge(s);
		entityTransaction.commit();
		System.out.println("Data updated in student table");

	}

}
