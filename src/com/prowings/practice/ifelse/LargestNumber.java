package com.prowings.practice.ifelse;

import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the First number :");
		Double number1 = scanner.nextDouble();
		
		System.out.println("Enter the Second number :");
		Double number2 = scanner.nextDouble();
		
		System.out.println("Enter the third number :");
		Double number3 = scanner.nextDouble();
		
		
		if (number1 >= number2 && number1 >= number3) {
            System.out.println("The largest number is: " + number1);
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("The largest number is: " + number2);
        } else {
            System.out.println("The largest number is: " + number3);
        }
	}

}
