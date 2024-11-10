package com.springBoot.learn_jpa_hibernate.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springBoot.learn_jpa_hibernate.course.Course;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseSpringDataJpaRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Course(3, "Learn Dev-Ops", "Srinivas"));
		System.out.println(repo.findById(1l));
		
	}

}
