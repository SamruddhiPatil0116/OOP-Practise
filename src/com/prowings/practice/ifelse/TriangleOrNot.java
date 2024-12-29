package com.prowings.practice.ifelse;

import java.util.Scanner;

public class TriangleOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the First Angle:");
		int angle1 = scanner.nextInt();
		
		System.out.println("Enter the Second Angle:");
		int angle2 = scanner.nextInt();
		
		System.out.println("Enter the third Angle:");
		int angle3 = scanner.nextInt();
		
		if(angle1 + angle2 + angle3 == 180)
			System.out.println("The Triangle is valid");
		else
			System.out.println("The Triangle is not Valid");
		
	}

}
