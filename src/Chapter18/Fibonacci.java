package Chapter18;

public class Fibonacci {

	public static void main(String[] args) {
		
		Fibonacci ob = new Fibonacci();
		
		System.out.println(ob.Fib(5));
		}
	
	public int Fib (int term) {
		
		if (term < 3)
			return 1;
		if (term == 3)
			return 2;
		
		else
			return Fib(term-2) + Fib(term - 1);
	}
}
