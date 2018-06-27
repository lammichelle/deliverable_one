package LabAttempt;
import java.util.Scanner;
import java.time.*; //importing specific date/time class

// LAB 1 PART 2 - DIFFERENCE BETWEEN DATES
// AUTHOR : MICHELLE LAM
// ABOUT THE PROGRAM: THIS PROGRAM WILL CALCULATE THE DIFFERENCE IN TWO USER SPECIFIED DATES IN TERMS OF MONTHS, DAYS, AND YEARS
public class lab2attempt3 {

	public static void main(String[] args) { //creating main method
			
		Scanner scnr = new Scanner(System.in); // creating a Scanner object
		
		LocalDate day1; 
		LocalDate day2;
		
		System.out.println("Please enter two dates in the 'yyyy-mm-dd' format:");
		
		//first input
		String date1 = scnr.nextLine();
		
		try {
			day1 = LocalDate.parse(date1);
		}
		catch (Exception e) { //responding to an exception
			System.out.println("Error");
			return;
		}
		
		//second input
		String date2 = scnr.nextLine();
		
		try {
			day2 = LocalDate.parse(date2);
		}
		catch (Exception e) {
			System.out.println("Error");
			return;
		}
	    
		//making sure dates cannot be negative
	    Period diff = Period.between( day1 , day2 ) ;
	    if (diff.isNegative()) {
	    	diff = Period.between(day2 , day1);
	    }
	 
	    //printing the output
	    System.out.print("The difference between dates measured: ");
	    System.out.print(diff.getYears() + " years, "); //retrieving value of years using getYear method 
	    System.out.print(diff.getMonths() + " months, ");
	    System.out.println(diff.getDays() + " days");
	    
		}
}


