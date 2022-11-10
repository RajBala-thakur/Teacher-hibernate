package com.ty.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Student;

public class StudentSave {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the address");
		String add=sc.next();
		System.out.println("enter the phone");
		long phone=sc.nextLong();
		System.out.println("enter the pincode");
		int pincode=sc.nextInt();
		System.out.println("enter the father_name");
		String fname=sc.next();
		System.out.println("enter the mother_name");
		String mname=sc.next();
		Student s=new Student();
		s.setName(name);
		s.setAddress(add);
		s.setPhone(phone);
		s.setPincode(pincode);
		s.setFather_name(fname);
		s.setMother_name(mname);
		entityTransaction.begin();
		entityManager.persist(s);
		entityTransaction.commit();
		System.out.println("Data added in student table");
		
		

	}

}
