package com.cubic.assessment;

public class Employee 
{
	int id;
	String Name;
	double Salary;
	
	public Employee(int id, String name, double salary)
	{
		super();
		this.id = id;
		Name = name;
		Salary = salary;
	}	
	void display()
	{
		System.out.println("Employee ID is:"+id);
		System.out.println("Employee name is:"+Name);
		System.out.println("Employee salary is:"+Salary);
	}
	void call1()
	{
		//super.display();
	}
}
