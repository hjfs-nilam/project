package com.course.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.entity.Course;
@Repository
public interface CourseDAO extends JpaRepository<Course, Integer> {

}
