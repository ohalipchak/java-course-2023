package java2023day1;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		
		//Entering the number of the Fibonacci number we are looking for 
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter the № of the Fibonacci number to find:");
		
		int number = scanner.nextInt();
		
		
		
		//Setting the loop to get the answer
		
		if(number == 1 || number == 2) {
			System.out.println("The №" + number + " Fibonacci number is 1");
		}
		else {
			int first = 1; //the first number immediately after the number we are calculating
			int second = 1; //the second number after the number we are calculatin
			
			for(int counter = 3; counter <= number; counter++) {
				
				int fibonacci = first + second;
				
				second = first;
				first = fibonacci;	
				
		}
			System.out.println("The №" + number + " Fibonacci number is " + first);
		}

	}//very strangely the algorithm works good up to about 47th number, I do not really understand what happens after that

}
