import java.util.*;


public class prob13 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		String data = "";
		while (!data.equals("0")) {
			
			data = in.next();
			if (data.equals("0")) {
				break;
			}
			
			
			
			if (data.length() == 19) {
				System.out.println("xxxx-xxxx-xxxx-" + data.substring(15));
			}
			else {
				System.out.println("xxx-xx-" + data.substring(7));
			}
			
			
			
			
			
		}

	}

}
