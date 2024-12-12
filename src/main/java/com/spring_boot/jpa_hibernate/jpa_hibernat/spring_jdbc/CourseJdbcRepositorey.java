package com.spring_boot.jpa_hibernate.jpa_hibernat.spring_jdbc;

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
	
	private String INSERT_QUERY2=
			"""
			insert into course(id, name, author) 
			values (?,?,?);
			""";
	private String DELETE_QUERY=
			"""
			delete from course where id=?
			""";
	
	public void insert()
	{
		jdbcTemplate.update(INSERT_QUERY);
	}
	
	public void insertCourse(Course course)
	{
		jdbcTemplate.update(INSERT_QUERY2,course.getId(),course.getName(),course.getAuthor());
	}
	
	public void deleteCourse(long id)
	{
		jdbcTemplate.update(DELETE_QUERY,id);
	}
}
