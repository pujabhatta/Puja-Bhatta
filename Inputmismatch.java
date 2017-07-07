package com.cubic.assessment;

import java.util.Scanner;

public class Inputmismatch {

	public static void main(String[] args) 
	{
		Scanner S= new Scanner(System.in);
		System.out.println("Please enter atleast 5 word string");
		String P =S.nextLine();// to enter into next number
		String a[]=P.split("");
	
		System.out.println("Please string again");
		String u =S.nextLine();// to enter into next number
		for(String s:a)
		{
			System.out.println("The word match");
		}
	
	}

}
