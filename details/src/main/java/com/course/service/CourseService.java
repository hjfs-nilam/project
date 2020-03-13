package com.course.service;

import java.util.List;
import java.util.Optional;

import com.course.entity.Course;


public interface CourseService {
	
	List<Course> getAllCourses();
	Course addCourse(Course course);
	Optional<Course> getCourseById(int id);

	Course updateCourse(Course course);

	void deleteCourseById(int id);

	void deleteAllCourses();

}
