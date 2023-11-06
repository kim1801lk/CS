import java.util.Scanner;

public class prob02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while ((num = scanner.nextInt()) != 0) {
            if (num % 4 == 0) {
                System.out.printf("%d/4 = %d%n", num, num / 4);
            }
        }
        scanner.close();
    }
}
