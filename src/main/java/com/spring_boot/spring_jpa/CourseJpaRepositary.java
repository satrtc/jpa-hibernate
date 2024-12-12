package com.spring_boot.spring_jpa;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepositary {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void insertCourse(Course course)
	{
		entityManager.merge(course);
	}
}
