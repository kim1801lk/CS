import java.util.ArrayList;
import java.util.Scanner;

public class longestSeqZero {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter Decimal Number: ");
		
		int num = in.nextInt();
		
		System.out.println("In Binary: ");
		ArrayList<Integer> i1 = new ArrayList<Integer>();
		
		while (num> 0) {
			i1.add(0,num%2);
			num = num /2;
		}
		
		//i1 is an array list with the binary of a decimal
		int sequence = 0;
		for (int i = 0; i < i1.size(); i++) {
			
			if (i1.get(i) == 0) {
				sequence++;
			}
			if (i1.get(i)!=0)
				sequence = 0;
		}
		
		System.out.println(i1);
		System.out.printf("longest sequence of zeros: %f", sequence);

	}

}
