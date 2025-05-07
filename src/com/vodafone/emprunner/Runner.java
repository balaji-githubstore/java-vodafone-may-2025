package com.vodafone.emprunner;

import java.util.ArrayList;

import com.vodafone.employee.Employee;

public class Runner {

	public static void main(String[] args) {
		
		Employee.companyName="Vodafone";
		Employee.companyLocation="Pune";
		
		
		Employee.companyName="Vodafone1";
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		Employee emp4= Employee.getEmployeeInstance();
		
		emp1.empId=101;
		emp1.empName="saul";
		emp1.empSalary=9000;
		emp1.empPerformance="A";
		
		//emp2 (102,Kim,8000,C,Vodafone,Pune)
		emp2.empId=102;
		emp2.empName="kim";
		emp2.empSalary=8500;
		emp2.empPerformance="C";

		emp2.printEmployeeRecords();
		emp1.printEmployeeRecords();
		emp3.printEmployeeRecords();
		
		Employee.printEmployeeRecords1(emp2);
		
		Employee[] emps=new Employee[3];
		emps[0]=emp1;
		emps[1]=emp2;
		emps[2]=emp3;
		
		System.out.println(emp1.empId);
		System.out.println(emp1);
		System.out.println(emps[0]);
		System.out.println(emps[0].empId);
		
		ArrayList<Employee> emps1=new ArrayList<Employee>();
		emps1.add(emp1);
	}

}




