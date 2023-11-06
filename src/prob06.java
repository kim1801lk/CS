import java.util.Scanner;

public class prob06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String info = "";
        info = sc.nextLine();
        while(info != "0 0 S") {
        	String dimensions[] = info.split(" ");
        	if(info.equals("0 0 S")) break;
        	if(dimensions[2].equals("S")) 
        	{
        		System.out.println("Square " + (2*(Integer.parseInt(dimensions[0])+Integer.parseInt(dimensions[1]))+80));
        	}
        	if(dimensions[2].equals("D")) 
        	{
        		System.out.println("Diagonal " + (2*(Integer.parseInt(dimensions[0])+Integer.parseInt(dimensions[1]))+320));
        	}
        	info = sc.nextLine();
        }
        sc.close();
    }    
}
