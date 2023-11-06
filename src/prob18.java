import java.util.*;

public class prob18 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		String word = in.nextLine();
		
		ArrayList<String> toppings = new ArrayList<String>(); 
		
		while (in.hasNext()) {
			String a = in.nextLine();
			if (a.equals("")){
				break;
			}
			else {
			toppings.add(a);}
			
		}
		
		
		
		if (toppings.size()==1) {
			System.out.println(toppings.get(0));
		}
		else if (toppings.size() == 2) {
			if (word.length()== 3) {
			System.out.println(toppings.get(0) +  " and " + toppings.get(1));
			}
			if (word.length()== 2) {
				System.out.println(toppings.get(0) +  " or " + toppings.get(1));}
		}
		
		else if (word.length()== 3) {
			
			for (int i = 0; i < toppings.size(); i++) {
				if (i == toppings.size()-1) {
					
					System.out.println(", and " + toppings.get(i));
				}
				else if (i == 0) {
					System.out.printf(toppings.get(0));
				}
				else {
					if (!toppings.get(i).equals("")&& i != 0) {
					System.out.printf(", " + toppings.get(i));}
				}
			}
		}
		
		else if (word.length()== 2) {
			for (int i = 0; i < toppings.size(); i++) {
				if (i == toppings.size()-1) {
					
					System.out.println(", or " + toppings.get(i));
				}
				else if (i == 0) {
					System.out.printf(toppings.get(0));
				}
				else {
					if (!toppings.get(i).equals("") && i != 0) {
					System.out.printf(", " + toppings.get(i));}
				}
			}
		}
	}

}
