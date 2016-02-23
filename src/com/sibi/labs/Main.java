package com.sibi.labs;

import java.util.Iterator;
import java.util.List;

public class Main {
	
	public static void main(String[] args){
		
		Course cprog = new Course("C programming");
		cprog.setDuration(50); //duration in hrs
		cprog.setMark(100); //pass mark
		
		Course dlit = new Course("Digital Literacy");
		dlit.setDuration(50); //duration in hrs
		dlit.setMark(100); //pass mark
		
		
		Student student = new Student("Bonface", 21);
		student.addCourse(cprog);
		student.addCourse(dlit);

		System.out.println("my name is: "+student.getName());
		
		List<Course> courses = student.getCourses();
		Iterator itr =  courses.iterator();
		
		while(itr.hasNext()){
			
			Course course = (Course) itr.next();
			System.out.println("Course: "+course.getName());
		}
	}
}
