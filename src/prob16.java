
import java.util.*;
public class prob16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String info = "";
        String swap = sc.nextLine();
        String[] swapL = swap.split(" ");
        info = sc.nextLine();
        ArrayList<String> temp = new ArrayList<String>();
        while(info != "END") {
        	if(info.equals("END"))break;
        	temp.add(info);
        	info = sc.nextLine();
        }
        String[] alphabet = new String[temp.size()];
        for(int i = 0; i< temp.size(); i++) 
        {
        	alphabet[i] = (temp.get(i)).toUpperCase();
        }
        for(int i = 0; i< temp.size(); i++) 
        {
        	char[] s = alphabet[i].toCharArray();
        	for(int b = 0; b< s.length; b++) 
        	{
        		if(s[b] == (swapL[0].charAt(0))) s[b]=swapL[1].charAt(0);
        		else if(s[b] == (swapL[1].charAt(0))) s[b]=swapL[0].charAt(0);
        		
        	}
        	alphabet[i] = String.valueOf(s);
        	
        }
        Arrays.sort(alphabet);
        
        for(int i = 0; i< temp.size(); i++) 
        {
        	char[] s = alphabet[i].toCharArray();
        	for(int b = 0; b< s.length; b++) 
        	{
        		if(s[b] == (swapL[0].charAt(0))) s[b]=swapL[1].charAt(0);
        		else if(s[b] == (swapL[1].charAt(0))) s[b]=swapL[0].charAt(0);
        	}
        	alphabet[i] = String.valueOf(s);
        	
        }
        for(int i = 0; i< temp.size(); i++) 
        {
        	alphabet[i] = alphabet[i].substring(0, 1).toUpperCase() + alphabet[i].substring(1).toLowerCase();
        	
        }
        for(int i = 0; i< temp.size(); i++) 
        {
        	System.out.println(alphabet[i]);
        	
        }
        sc.close();
    }
}