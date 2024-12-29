package com.prowings.practice.ifelse;

import java.util.Scanner;

public class CharacterChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Character :");
        char ch = scanner.next().charAt(0);
        
        if((ch >= 'A') &&(ch <= 'Z'))
        	System.out.println("The Character is UpperCase letter");
        else if((ch >= 'a') && (ch <= 'z'))
        	System.out.println("The Character is LowerCase letter");
        else if((ch >= '0') && (ch <='9'))
        	System.out.println("The Digit");
        else
        	System.out.println("It is Special Character");
        	
        
				
	}

}
