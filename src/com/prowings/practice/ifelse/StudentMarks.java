package com.prowings.practice.ifelse;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Marks:");
		double marks = scanner.nextDouble();
		
		if(marks >= 90)
		{
			System.out.println("Grade is A");
		}
		else if(marks >= 80)
		{
			System.out.println("Grade is B");
		}
		else if(marks >= 70)
		{
			System.out.println("Grade is C");
		}
		else if(marks >= 60)
		{
			System.out.println("Grade is D");
		}
		else
			System.out.println("Student is Fail");
	}
	
}
