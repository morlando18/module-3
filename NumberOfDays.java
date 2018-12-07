import java.util.Scanner;
public class NumberOfDays {
	
	public static void main(String[] args){
		
		// variables
		int month, year, days;
		String monthName;
		Scanner input = new Scanner(System.in);
		
		//initializing
				monthName = "January";
				days = 30;
				
		//ask
		System.out.print("Enter days and year : ");
		month = input.nextInt();
		year = input.nextInt();
		
		//pick
		switch (month){
		case 1: days = 31; monthName = "January"; 	 break;
		case 2: days = 29; monthName = "February";	 break;
		case 3: days = 31; monthName =  "March"; 	 break;
		case 4: days = 30; monthName =  "April"; 	 break;
		case 5: days = 31; monthName =  "May";		 break;
		case 6: days = 30; monthName =  "June";		 break;
		case 7: days = 31; monthName =  "July";		 break;
		case 8: days = 31; monthName =  "August";	 break;
		case 9: days = 30; monthName =  "September"; break;
		case 10: days = 31; monthName =  "October";	 break;
		case 11: days = 30; monthName =  "November"; break;
		case 12: days = 31; monthName =  "December"; break;
		}
		
		System.out.println(monthName + " " + year + " had " + days + " days.");

	}

}
