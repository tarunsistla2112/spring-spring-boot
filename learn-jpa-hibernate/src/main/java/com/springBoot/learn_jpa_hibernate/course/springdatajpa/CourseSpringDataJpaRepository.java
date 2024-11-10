package com.springBoot.learn_jpa_hibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.learn_jpa_hibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

}
