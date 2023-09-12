package java2023day1;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		//Entering the Integer 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an intiger:");
		
		int integer = scanner.nextInt();
		
		
		//Calculating the result of the multiplication
		int output = 1;
		
		while (integer > 0) {
						
			int digit = integer % 10;
			
			output *= digit;
					
			integer /= 10;
			//This works because of how Java divides integers - leaving only the quotient value
		}
		
		System.out.println("The result:" +output);
		
	

	}

}
