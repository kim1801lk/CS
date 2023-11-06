
public class largestPalindrome {

	public static void main(String[] args) {
		
		int largestPalindrome = 0;
		
		for (int i = 0; i < 100; i ++) {
			
			if (reverse(i) == i)
				if (i > largestPalindrome)
					largestPalindrome = i;
		}
		
		System.out.printf("Largest Palindrome: %d", largestPalindrome);

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
