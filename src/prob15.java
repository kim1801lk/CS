import java.util.*;

import java.time.LocalDate;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class prob15 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner (System.in);
		
		String inputDate = in.nextLine();
        String[] date = inputDate.split(" ");
        
        //making correct string format for the date
        
        String [] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        int month = 0;
        for (int i = 0; i < 12; i++) {
        	if (date[1].equals(months[i])){
        		month = i +1;
        		break;
        	}
        }
        
        int dateNum = Integer.parseInt(date[2]);
        
        String year = in.nextLine();
        String [] years = year.split("-");
        
        for (int i = Integer.parseInt(years[0]); i < Integer.parseInt(years[1]); i++){
        	String checkDate = String.valueOf(i) + "/" +  String.valueOf(month) +  "/" + date[2];
        	if (isValidDate(checkDate)) {
        		
        	}
        }
		

	}
	


	    public static boolean isValidDate(final String date) {

	        boolean valid = false;

	        try {

	            // ResolverStyle.STRICT for 30, 31 days checking, and also leap year.
	            LocalDate.parse(date, DateTimeFormatter.ofPattern("uuuu/M/d").withResolverStyle(ResolverStyle.STRICT));
	            valid = true;

	        } 
	        
	        catch (DateTimeParseException e) {
	            e.printStackTrace();
	            valid = false;
	        }

	        return valid;
	    }
	}


