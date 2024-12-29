package com.prowings.practice.ifelse;

import java.util.Scanner;

public class traingle_equality {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enther the First Side of Triangle :");
		int side1 = scanner.nextInt();
		
		System.out.println("Enter the Second Side of Triangle :");
		int side2 = scanner.nextInt();
		
		System.out.println("Enter the third Side of Triangle :");
		int side3 = scanner.nextInt();
		
		if(side1 == side2 && side2 == side3)
			System.out.println("The Triangle is  equilatral.");
		else if(side1 == side2 || side2 == side3 || side3 == side1)
			System.out.println("The Triangle is isosceles. ");
		else
			System.out.println("The Traingle is  Scalene.");
	}

}
