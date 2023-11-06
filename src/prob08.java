import java.util.Scanner;

public class prob08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int power = scanner.nextInt();

        int exp = 0;
        int temp = base;
        while (temp < power) {
            temp *= base;
            exp++;
        }

        if (temp == power) {
            System.out.printf("%d^%d = %d\n", base, exp + 1, power);
        } 

        scanner.close();
    }
}
