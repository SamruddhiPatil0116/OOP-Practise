package com.prowings.practice.ifelse;

import java.util.Scanner;

public class Evenodd {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int number = scanner.nextInt();
		
		if(number % 2 ==0)
		System.out.println("Given number is even number");
		else
			System.out.println("Given number is odd number");
		
	}

}
