import java.util.Scanner;

public class prob03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float ponies = sc.nextFloat();
        float capacity = sc.nextFloat();
        float growth = sc.nextFloat();
        float years = sc.nextFloat();
        float p = (ponies*(1+growth)*years);
        int count = (int)p;
        System.out.println("At the current rate of growth there will be " + count + " ponies in " + (int)years + " years.");
        if(count>capacity) 
        {
        	System.out.println("Celestia will need to add space for at least " + (count-(int)capacity) + " ponies!");
        }
        else 
        {
        	System.out.println("Celestia won't need to add space yet!");
        }
        sc.close();
    }    
}
