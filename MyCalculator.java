package com.cubic.assessment;

import java.util.Scanner;



public class MyCalculator 
{
	
	 void power(int n,int p) throws InvalidNum
	{
		if(n<0||p<0)
		{
			throw new InvalidNum("You typed invalid number");
		}
		
		else
		{
			int a=(int) Math.pow(n, p) ;
			System.out.println(a);
		}
			
		
	}
	
	public static void main(String[] args) throws InvalidNum
	{
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Please enter the number");
		int n= in.nextInt();
		
		System.out.println("Please enter the second number");
		int p= in.nextInt();
		
		try{
			new MyCalculator().
		power(n, p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	class InvalidNum extends Exception
	{

		public InvalidNum(String message) 
		{
			super(message);
			// TODO Auto-generated constructor stub
		}
		void display()
		{
			System.out.println("n and p can not be non negative");
		}
		
	}
	
}
