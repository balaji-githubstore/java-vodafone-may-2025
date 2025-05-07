package com.vodafone.student;

public class StudentRunner {
	
	
	public static void main(String[] args) {
		
		Student.schoolName="Global";
		Student.schoolAddress="Pune";
		
		Student stu1=new Student(101, "Jack");
		Student stu2=new Student(102);
		Student stu3=new Student(103);
		Student stu4=new Student(103);
		
		stu1.studentName="jack";
		stu1.studentMailId="jack@global.com";
		stu1.studentPercentage=45.2;
		
	}

}
