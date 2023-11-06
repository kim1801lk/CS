import java.util.*;

public class prob07 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int num = 1;
		while (num!=0) {
			
			num = in.nextInt();
			if (num == 0) {
				break;
			}
			if (num%5 ==0 && num %9 == 0) {
				System.out.printf("%d FIZZ FUZZ!\n", num);
				continue;
			}
			
			else if (num%5 ==0) {
				System.out.printf("%d FIZZ\n", num);
				continue;
			}
			else if (num%9 ==0) {
				System.out.printf("%d FUZZ\n", num);
				continue;
			}
		}

	}

}
