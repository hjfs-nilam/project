package com.course.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Course_Table")
public class Course {
	@Column(name = "Course_Id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "Course_Name", nullable = true, length = 50)
	private String course_name;

	@Column(name = "Course_Description", nullable = true, length = 50)
	private String course_Description;
	@Column(name = "Course_Category", nullable = true, length = 50)
	private String course_Category;
	@Column(name = "Course_Auther", nullable = true, length = 50)
	private String course_Auther;
	public Course() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_Description() {
		return course_Description;
	}
	public void setCourse_Description(String course_Description) {
		this.course_Description = course_Description;
	}
	public String getCourse_Category() {
		return course_Category;
	}
	public void setCourse_Category(String course_Category) {
		this.course_Category = course_Category;
	}
	public String getCourse_Auther() {
		return course_Auther;
	}
	public void setCourse_Auther(String course_Auther) {
		this.course_Auther = course_Auther;
	}

}
