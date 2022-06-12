import java.time.LocalDate; //Q1.1
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Date{
	
	public static void main(String[] args){
	
        String givenDate = "January 20, 1995";	
	
	DateTimeFormatter form = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
	
	LocalDate myDate = LocalDate.parse(givenDate,form);
		
	System.out.println("Date provided:" + myDate); //Q1.2

	System.out.println("My Date format requested: " + myDate.getMonthValue() + "/" + myDate.getDayOfMonth() + "/" + myDate.getYear()); //Q1.3

	LocalDate later = myDate.plusDays(20);

	System.out.println("Later Date created: " + later); //Q1.4
	
	myDate = myDate.plusDays(20);

	System.out.println("My Date updated: " + later); //Q1.5

}


}
