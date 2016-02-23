package com.sibi.labs;


/**
 * Consider two properties of a course
 * Write appropriate mutator and accessor methods 
 * Write a method to store the values in a file
 * write a method to read the values from the file
 * @param x
 * @return
 */

public class Course {
	
	private int duration;
	private double mark;
	private String name;
	
	public Course(int duration, double mark, String name){
		
		this.duration = duration;
		this.mark = mark;
		this.name = name;
	}
	
	public Course(String name){
		
		this.name = name;
	}
	
	public Course(){
		
		//
	}
	
	public void setDuration(int duration){
	
		this.duration = duration;
	}
	
	public int getDuration(){
		
		return this.duration;
	}
	
	public void setMark(int mark){
		
		this.mark = mark;
	}
	
	public double getMark(){
		
		return this.mark;
	}
	
	public void setNamw(String name){
		
		this.name = name;
	}
	
	public String getName(){
		
		return this.name;
	}
}
