import java.util.Scanner;

public class prob05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        StringBuilder heximal = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            int ascii = (int) c;

            String hex = Integer.toString(ascii, 6);

            if (hex.length() < 3) {
                hex = "0".repeat(3 - hex.length()) + hex;
            }

            heximal.append(hex);
        }

        System.out.println(heximal.toString());
        scanner.close();
    }
}
