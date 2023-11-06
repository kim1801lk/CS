
import java.util.*;
public class prob04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		String find = in.next();
		String main = in.next();
		int index = 0;
		
		for (int i = 0; i < main.length(); i++) {
			if (main.substring(i, i+1).equals(find)) {
				index = i;
				break;
			}
		}
		
		System.out.printf("%s is at index: %d\n\n", find, index);

	}

}
