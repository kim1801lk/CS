import java.util.*;

public class DecimaltoBinary {

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
		
		System.out.println(i1);
	
		

	}

}
