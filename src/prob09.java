import java.util.*;


public class prob09 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int cars = Integer.parseInt(in.nextLine());
		double raceTime = (double)Integer.parseInt(in.nextLine())/60; //hours
		
		
		
		
		
		for (int i = 0; i < cars; i++) {
			
			//total distance traveled 
			double rate = in.nextDouble();
			double distance = Math.floor(rate * raceTime * 100) / 100;

			System.out.printf("(%.2f)", distance);
			
			
			
			//car design
			String design = in.next();
			
			
			
			//dashes
			int dashes = (int) distance /5;
			for (int d = 0; d < dashes; d++) {
				System.out.printf("-");
			}
			
			
			//tilde
			double remainder = distance %5;
			for (int t = 0; t < 5; t++) {
				if (remainder > 1) {
					System.out.printf("~");
					remainder--;
				}
			}
			
			
			//brackets
			for (int b = 0; b < 4; b++) {
				if (remainder >0.24) {
					System.out.printf("{}");
					remainder = remainder - 0.25;
				}
			}
			
			//print car design
			System.out.printf("%s",design);
			
			
			
			
			System.out.println();
		}
		
		
		
		

	}

}
