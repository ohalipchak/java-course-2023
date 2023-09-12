package java2023day1;

public class FirstExample {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		int sum = 0;
		
		for (int x = 2; x < 10; x++) {
			sum = x++;
			System.out.println (sum); 
		}
		
				
		byte i = 0;
		
		while (i < 0) {
			byte a = (i++);
			byte b = --a;
			System.out.println(a + " " + b + " " + i);
		}
		
		
		int first = 59;
		int second = first % 10;
		first /= 10; 
		
		System.out.println(first);
		System.out.println(second);
		
		
		
		
	}
}


