package com.spring_boot.jpa_hibernate.jpa_hibernate.spring_jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring_boot.jpa_hibernate.jpa_hibernate.course.Course;

@Component
public class CourseJdbCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepositorey courseJdbcRepositorey;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		courseJdbcRepositorey.insert();
//		courseJdbcRepositorey.insertCourse(new Course(2,"ragnarok","marvel"));
//		courseJdbcRepositorey.insertCourse(new Course(3,"loki","marvel"));
//		courseJdbcRepositorey.insertCourse(new Course(4,"ca","marvel"));
//		courseJdbcRepositorey.insertCourse(new Course(5,"tasm","marvel"));

		courseJdbcRepositorey.deleteCourse(4);
	}
}
