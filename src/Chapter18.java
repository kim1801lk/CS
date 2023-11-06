
public class Chapter18 {

	public static void main(String[] args) {
		
		Chapter18 obj1 = new Chapter18();
		

		System.out.println(obj1.Power(2, 4));
	}
	
	public int Power(int base, int power) {
		if (power == 0)
			return 1;
		
		else
			return base * Power(base, power-1);
		
		}

}
