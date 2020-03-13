package com.course.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.course.entity.Course;
import com.course.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	CourseService courseservice;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Course> getAllCourses() {
		return this.courseservice.getAllCourses();
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Course addCourse(@RequestBody Course course) {
		return this.courseservice.addCourse(course);

	}
	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	 public Course updateCourse(@RequestBody Course course)
	{
		return this.courseservice.updateCourse(course);
		
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Course> getCourseById(@PathVariable int id) {
		return courseservice.getCourseById(id);

	}

	@RequestMapping(value = "/deleteall", method = RequestMethod.DELETE)
	public void deleteAllCourses() {
		this.courseservice.deleteAllCourses();
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deleteCourseById(@PathVariable int id) {
		this.courseservice.deleteCourseById(id);
	}

}
