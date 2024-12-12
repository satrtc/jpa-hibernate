package com.spring_boot.spring_data_jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_boot.spring_jpa.Course;

public interface CourseJpaDataRepositary extends JpaRepository<Course,Long>{

}
