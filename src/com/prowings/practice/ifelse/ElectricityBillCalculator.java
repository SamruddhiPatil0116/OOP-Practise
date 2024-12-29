package com.prowings.practice.ifelse;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of electricity units consumed: ");
        int units = scanner.nextInt();

        double billAmount;

       
        if (units <= 100) {
            billAmount = units * 0.50;
        } else if (units <= 200) {
            billAmount = (100 * 0.50) + ((units - 100) * 0.75);
        } else if (units <= 300) {
            billAmount = (100 * 0.50) + (100 * 0.75) + ((units - 200) * 1.20);
        } else {
            billAmount = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 300) * 1.50);
        }

        
        System.out.printf("Total bill amount: $%.2f%n", billAmount);

       
        scanner.close();
    }
}
