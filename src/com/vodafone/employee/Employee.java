package com.vodafone.employee;

public class Employee {
	public int empId;
	public String empName;
	public double empSalary;
	public String empPerformance;
	public static String companyName;
	public static String companyLocation;
	
	public void printEmployeeRecords()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(empPerformance);
		System.out.println(Employee.companyName);
		System.out.println(Employee.companyLocation);
		System.out.println("--------------------------------------");
	}
	
	public static String getAuthorName()
	{
		return "Balaji Dinakaran";
	}
	
	
	
	public static void printEmployeeRecords1(Employee x)
	{
		System.out.println(x.empId);
		System.out.println(x.empName);
		System.out.println(x.empSalary);
		System.out.println(x.empPerformance);
		System.out.println(Employee.companyName);
		System.out.println(Employee.companyLocation);
		System.out.println("--------------------------------------");
	}
	
	public static Employee getEmployeeInstance()
	{
		Employee e=new Employee();
		return e;
	}
}
