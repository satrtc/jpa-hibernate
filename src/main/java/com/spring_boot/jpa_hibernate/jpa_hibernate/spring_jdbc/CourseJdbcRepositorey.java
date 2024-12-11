package com.spring_boot.jpa_hibernate.jpa_hibernate.spring_jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepositorey {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private String INSERT_QUERY=
			"""
			insert into course(id, name, author) 
			values (1,'earning knowledge', 'cpladder');
			""";
	public void insert()
	{
		jdbcTemplate.update(INSERT_QUERY);
	}
}
