import java.util.Scanner;

public class prob14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] tribonacci = new int[36];
        tribonacci[0] = 0;
        tribonacci[1] = 1;
        tribonacci[2] = 1;
        for (int i = 3; i <= 35; i++) {
            tribonacci[i] = tribonacci[i-1] + tribonacci[i-2] + tribonacci[i-3];
        }
        
        while (true) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            if (m == 0 && n == 0) {
                break;
            }
            
            int difference = tribonacci[m] - tribonacci[n];
            System.out.println(difference);
        }
        
        sc.close();
    }
}
