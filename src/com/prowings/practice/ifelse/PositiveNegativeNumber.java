package com.prowings.practice.ifelse;

import java.util.Scanner;

public class PositiveNegativeNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		double number = scanner.nextDouble();
		
		if(number > 0)
		{
			System.out.println("The number is a positive");
		}
		else if(number < 0) 
		{
			System.out.println("The number is a negative"); 
		}
		else
		 {
			System.out.println("The number is a Zero"); 
		 }
		
		}
	
}
	


