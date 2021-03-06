package com.bridgelabz.prototypedesignpattern;

import com.bridgelabz.prototypedesignpattern.Prototype;

public class EmployeeRecord implements Prototype {

	private int id;
	private String name, department;
	private double salary;
	
	public EmployeeRecord(int id, String name, String department, double salary) {
	
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		
	}
	
	public void showRecord(){
			System.out.println(id+" "+name+" "+department+" "+salary);
	}

	@Override
	public Prototype getClone() {
		
		return new EmployeeRecord(id, name, department, salary);
	}

	
	
	
	
}
