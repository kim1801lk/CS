
import java.util.*;
import java.util.Random;

public class numGen {


	
	public static void main(String[] args) {
		
		//1-50
		Random rand = new Random();
		
		int a = 1;
		
		int times = 1;
		
		int b = 0;
		
		int times1 = 1;
		
		int min = 150;
		
		for (int i = 0; i < 50; i ++) {
			
			b = rand.nextInt(150) + 1;
			if (b > a) {
				a = b;
				times = 1;
			}
			
			if (b == a)
				times++;
			
			if (b < min) {
				min = b;
				times1++;
			}
			
			if (b == min)
				times1++;
		}
		
		System.out.printf("Largest Number: %d", a);
		System.out.printf("\nNumber of times generated: %d", times);
		System.out.printf("\nSmallest Number: %d", min);
		System.out.printf("\nNumber of times generated: %d", times1);
	}

}
