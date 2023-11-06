import java.util.*;

public class prob17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        
        int n = input.length();
        for (int i = 1; i <= n/2; i++) {
            boolean isPattern = true;
            for (int j = 1; j < n/i; j++) {
                String segment1 = input.substring((j-1)*i, j*i);
                String segment2 = input.substring(j*i, (j+1)*i);
                if (!segment1.equals(segment2)) {
                    isPattern = false;
                    break;
                }
            }
            if (isPattern) {
                String pattern = input.substring(0, i);
                String lastSegment = input.substring((n/i)*i);
                String missingChars = pattern.substring(lastSegment.length());
                System.out.println(missingChars);
                System.out.println(pattern);
                return;
            }
        }
    }
}
