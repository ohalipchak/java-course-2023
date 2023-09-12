package java2023day1;

public class Exercise9 {

	public static void main(String[] args) {
		
		// Part a)
		
		for ( int i = 1; i < 100000; i ++) {
			
			int sum = 0 ;
			
			for ( int j = 1 ; j <= i / 2 ; j ++) {
			if ( i % j == 0 )
			sum += j ;
			}
			if ( sum == i )
			System.out.println( i + "is the perfect number.");
			}
		
		
	
	
	}

}

