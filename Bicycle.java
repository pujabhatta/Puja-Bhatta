package com.cubic.assessment;



public class Bicycle 

{
	String define_me()
	{
        return "a vehicle with pedals.";
	}
	
}

class Motorcycle extends Bicycle
{
	String define_me()
	{
		return "a cycle with an engine";
	}
	Motorcycle()
	{
		System.out.println("Hello I am a motorcycle, I am "+ define_me ());
		String temp=super.define_me();
		
		
		{
		
			
			System.out.println("My ancestor is a cycle who is"+temp);
			
		}
		
		
	}

	
	
}