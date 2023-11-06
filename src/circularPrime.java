import java.util.ArrayList;
import java.util.*;
public class circularPrime {

	public static void main(String[] args) {
		
	
	
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i < 100; i++) {
			
			if (isPrime(i))
				if(isPrime(reverse(i))) 
				numbers.add(i);
			
			
		}
		
		System.out.println(numbers);

	}
	
	public static boolean isPrime(int n) {
		int divisible = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}	
		}
		return true;
	}

	public static int reverse(int n) {
		int reverse = 0;
		while (n != 0) {
		      int remainder = n % 10;
		      reverse = reverse * 10 + remainder;
		      
		      n /= 10;
		    }
		return reverse;
	}
	
	
	
	
}
