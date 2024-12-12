package com.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring_boot.jpa_hibernate.jpa_hibernat.spring_jdbc.CourseJdbcRepositorey;
import com.spring_boot.spring_data_jpa.CourseJpaDataRepositary;
import com.spring_boot.spring_jpa.Course;
import com.spring_boot.spring_jpa.CourseJpaRepositary;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJpaRepositary courseJpaRepositary;

//	@Autowired
//	private CourseJdbcRepositorey courseJdbcRepositorey;
	
	@Autowired
	private CourseJpaDataRepositary courseJpaDataRepositary;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		//spring jpa implementation
//		courseJpaRepositary.insertCourse(new Course(3, "springboot", "rtc"));
//		courseJpaRepositary.insertCourse(new Course(4, "springboot", "rtc"));
//		courseJpaRepositary.insertCourse(new Course(5, "springboot", "rtc"));
//
//		courseJpaRepositary.deleteById(4);
//
//		System.out.println(courseJpaRepositary.findById(3));
//		System.out.println(courseJpaRepositary.findById(4));
//		System.out.println(courseJpaRepositary.findById(5));
		
//		courseJdbcRepositorey.insert();
		
		//spring-data-jpa implementation
		System.out.println("Inserting data");
		courseJpaDataRepositary.save(new Course(1,"walmart","Rtc"));
		courseJpaDataRepositary.save(new Course(2,"amazon","Rtc"));
		courseJpaDataRepositary.save(new Course(3,"adobe","Rtc"));
		
		System.out.println(courseJpaDataRepositary.findById(1l));
		System.out.println(courseJpaDataRepositary.findById(2l));
		System.out.println(courseJpaDataRepositary.findById(3l));
		
		courseJpaDataRepositary.deleteById(2l);
		System.out.println("After deleting id 2 data");
		System.out.println(courseJpaDataRepositary.findById(1l));
		System.out.println(courseJpaDataRepositary.findById(2l));
		System.out.println(courseJpaDataRepositary.findById(3l));
	}
}
