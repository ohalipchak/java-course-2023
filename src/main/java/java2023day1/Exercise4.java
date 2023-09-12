package java2023day1;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
				
		//Obtaining the radius input
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter the radius of the circle:");
		
		double radius = scanner.nextDouble();
		
		//Setting the formulas
		double pi = 3.14159265359;
		
		double area = pi * radius * radius;
		double circumference = 2 * pi * radius;
		
		System.out.println("Area: " +area);
		System.out.println("Circumference:" +circumference);
	}

}
