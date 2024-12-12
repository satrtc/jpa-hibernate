package com.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring_boot.jpa_hibernate.jpa_hibernat.spring_jdbc.CourseJdbcRepositorey;
import com.spring_boot.spring_jpa.Course;
import com.spring_boot.spring_jpa.CourseJpaRepositary;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJpaRepositary courseJpaRepositary;

//	@Autowired
//	private CourseJdbcRepositorey courseJdbcRepositorey;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		courseJpaRepositary.insertCourse(new Course(3, "springboot", "rtc"));
		courseJpaRepositary.insertCourse(new Course(4, "springboot", "rtc"));
		courseJpaRepositary.insertCourse(new Course(5, "springboot", "rtc"));

		courseJpaRepositary.deleteById(4);

		System.out.println(courseJpaRepositary.findById(3));
		System.out.println(courseJpaRepositary.findById(4));
		System.out.println(courseJpaRepositary.findById(5));
		
//		courseJdbcRepositorey.insert();
	
	}
}
