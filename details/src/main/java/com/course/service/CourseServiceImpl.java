package com.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.dao.CourseDAO;
import com.course.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
      @Autowired
      CourseDAO coursedao;
	
	
	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return coursedao.findAll();
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return coursedao.save(course);
	}

	@Override
	public Optional<Course> getCourseById(int id) {
		// TODO Auto-generated method stub
		return coursedao.findById(id);
	}

	@Override
	public Course updateCourse(Course course) {
		
		return coursedao.save(course);
	}

	@Override
	public void deleteCourseById(int id) {
		this.coursedao.deleteById(id);
		
	}

	@Override
	public void deleteAllCourses() {
		this.coursedao.deleteAll();
		
	}

}
