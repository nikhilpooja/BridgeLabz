package com.bridgelabz.designpattern;

import com.bridgelabz.utility.Utility;

public class EmployeeDemo implements Cloneable {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		
		System.out.println("Enter Employee id");
		int empId = Utility.getInt();
		
		System.out.println("Enter Employee Name");
		String empName = Utility.getString();
		
		System.out.println("Enter Employee Departname");
		String empDept = Utility.getString();
		
		System.out.println("Enter Employee Salary");
		Double salary = Utility.getDouble();

		EmployeeRecord employeeRecord = new EmployeeRecord(empId, empName, empDept, salary);
		
		employeeRecord.showRecord();
		System.out.println();
		EmployeeRecord employeeRecord2 = (EmployeeRecord) employeeRecord.getClone();
		
		employeeRecord2.showRecord();
	}
}