package java2023day1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter the weight of the package:");
		
		double weight = scanner.nextDouble();
		
		if (weight > 0 && weight <= 3) {
			double price = 1.5 * weight;
			System.out.println(price);
		}
		else if (weight > 3 && weight <= 5) {
			double price = 2.5 * weight;
			System.out.println(price);
		}
		else if (weight > 5 && weight <=10) {
			double price = 4.2 * weight;
			System.out.println(price);
		}
		else {
			System.out.println("Sorry, we do not yet provide service for the packages the size you entered");
		}
		
		//I have some strange results of rounding when I enter 6 and 7 (and maybe also other variables)

	}

}
