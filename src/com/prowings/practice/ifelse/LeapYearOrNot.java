package com.prowings.practice.ifelse;

import java.util.Scanner;

public class LeapYearOrNot {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Year :");
		int year = scanner.nextInt();
		
		if(year % 4==0)
			System.out.println("Given year is the leap year");
		else
			System.out.println("Given year is a not leap year");
	}

}
