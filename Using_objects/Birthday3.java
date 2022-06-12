import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Birthday{

	public static void main(String[] args){

		Scanner scanb = new Scanner(System.in);

		System.out.println("Enter your birth month [1..12]:");
		int month = scanb.nextInt();

		System.out.println("Enter your birth day of month:");
		int date = scanb.nextInt();

		System.out.println("Enter your birth year [4-digit year]:");
		int year = scanb.nextInt();

		LocalDate today = LocalDate.now();

		LocalDate birthday = LocalDate.of(year,month, date);
		
		if(month < today.getMonthValue()){
			System.out.println("Your birthday has already happened this year.");
			System.out.println("You're " + (today.getYear() - year) + "years old.");
		}
		
		else if(month == today.getMonthValue()){
			if(date < today.getDayOfMonth()){	
				System.out.println("Your birthday has not yet happened this year.");
				System.out.println("You're " + (today.getYear() - year) + "years old.");
			}
			
			else if(date == today.getDayOfMonth()){	
				System.out.println("Happy birthday!");
				System.out.println("You're " + (today.getYear() - year) + "years old.");
			}
	
			else{
				System.out.println("Your birthday has not yet happened this year.");
				System.out.println("You're " + ((today.getYear() - year)-1) + "years old.");
			}
		}
		else{
			System.out.println("Your birthday has not yet happened this year.");
			System.out.println("You're " + ((today.getYear() - year)-1) + "years old.");
		}
	}

}
