
public class curiousNumber {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		int curiousNum = 0;
		
		for (int i = 1; i < 1000000; i++) {
			num = i;
			while (num > 0) {
				
				sum = sum + factorial(num%10);
				num = num/10;

			}
			if (sum == i) {
				System.out.println(i);
				curiousNum++;
			}
			sum = 0;
		}
		
		System.out.println(curiousNum);

	}
	
	public static int factorial(int x) {
		
		int factorial = 1;
		
		for (int i = 1; i <= x; i ++) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
