package com.vodafone.student;

public class Student {
	
	public int studentId;
	public String studentName;
	public String studentMailId;
	public double studentPercentage;
	public static String schoolName;
	public static String schoolAddress;
	
	public Student(int studentId)
	{
		System.out.println("Object created!!!");
		this.studentId=studentId;
	}
	
	public Student(int studentId,String studentName)
	{

	}
	
	public Student(String studentName,int studentId)
	{

	}
}
