import java.util.Scanner;

public class prob10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();
        String[] start = one.split("-");
        String[] end = two.split("-");
        String name = sc.next();
        int temp1 = 12*(Integer.parseInt(end[0])-Integer.parseInt(start[0])-1);
        int temp2 = (12-Integer.parseInt(start[1]))+Integer.parseInt(end[1]);
        int day1 = Integer.parseInt(start[2]);
        int day2 = Integer.parseInt(end[2]);
        if((day1-day2)>0)temp2--;
        int months = temp1+temp2;
        
        System.out.println(name + " is " + months + " months old");
        sc.close();
    }    
}
