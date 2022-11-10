package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Student;

public class FindStudent {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Student s=entityManager.find(Student.class, 1);
		System.out.println(s.getName());
		System.out.println(s.getMother_name());
		System.out.println(s.getFather_name());
		System.out.println(s.getPhone());
		System.out.println(s.getAddress());
		System.out.println(s.getPincode());
		System.out.println("Data Fetched of first row");

	}

}
