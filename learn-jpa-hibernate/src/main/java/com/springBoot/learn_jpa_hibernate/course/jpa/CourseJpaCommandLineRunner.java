package com.springBoot.learn_jpa_hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springBoot.learn_jpa_hibernate.course.Course;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJPARepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.insert(new Course(2, "Learn Python", "Sushma"));
		System.out.println(repo.findById(1));
		
	}

}
