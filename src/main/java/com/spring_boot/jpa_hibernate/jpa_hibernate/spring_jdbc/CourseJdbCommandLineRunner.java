package com.spring_boot.jpa_hibernate.jpa_hibernate.spring_jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepositorey courseJdbcRepositorey;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		courseJdbcRepositorey.insert();
	}
}
