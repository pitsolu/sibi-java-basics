package com.sibi.labs;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name;
	private int age;
	
	private List<Course> courses;
//	private Course course;
	

	public Student(String name, int age){
		
		this.name = name;
		this.age = age;
		
		this.courses = new ArrayList<Course>();  
	}
	
	public Student(){
		
		this.courses = new ArrayList<Course>(); 
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public void addCourse(Course course){
		
		this.courses.add(course);
	}
	
	public List<Course> getCourses(){
		
		return this.courses;
	}
	
}

