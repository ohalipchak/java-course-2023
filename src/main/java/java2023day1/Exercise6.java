package java2023day1;

import java.util.Random;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		
		//Setting the secret number from the console 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer number (from 0 to 1000) to guess:");
		int reference_number = scanner.nextInt();
		
		//Quessing the number
				
		int count = 1;
		int counter = 1;
		
		Random r = new Random ();
		int number = r.nextInt (1000);
					
		while(number != reference_number) {
			
			count = ++counter;
			
			number = r.nextInt(1000);
						
		}
						
		System.out.println("The program quessed the number in " + count + " runs");
		
	}

}
