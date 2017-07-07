package com.cubic.assessment;

public class SoftwareEngineer extends Employee 
{
	double bonus;
	public SoftwareEngineer(int id, String name, double salary, double bonus) 
	{
		super(id, name, salary);
		this.bonus = bonus;
	}
	void display() 
	{
		System.out.println("Total bonus is:"+bonus);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Employee E=new Employee(5678,"Puja",5000);
		E.display();
		
	}
	
}

